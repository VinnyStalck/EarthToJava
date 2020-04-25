package baunilla.earthtojava.common.fluid;

import baunilla.earthtojava.common.EarthBlocks;
import baunilla.earthtojava.common.EarthFluids;
import baunilla.earthtojava.common.EarthItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.BaseFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;
import net.minecraft.world.WorldView;

public class Mud extends BaseFluid {
    
    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }        
    @Override
    protected boolean isInfinite() {
        return false;
    }    
    
    @Override
    protected void beforeBreakingBlock(IWorld world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.getBlock().hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world.getWorld(), pos, blockEntity);
    }            
    
    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid,
    Direction direction) {
        return false;        
    }    
    
    @Override
    protected int getFlowSpeed(WorldView worldView) {
        return 1;
    }    
    
    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 4;
    }            

    @Override
    public int getTickRate(WorldView world) {
        return 40;
    }
    
    @Override
    protected float getBlastResistance() {
        return 100.0f;
    }

    /*
     * Implementation
     */
    @Override
    public Fluid getStill() {
        return EarthFluids.STILL_MUD;
    }

    @Override
    public Fluid getFlowing() {
        return EarthFluids.FLOWING_MUD;
    }    

    @Override
    public Item getBucketItem() {
        return EarthItems.MUD_BUCKET;
    }
    
    @Override
    protected BlockState toBlockState(FluidState state) {
        return EarthBlocks.MUD.getDefaultState().with(Properties.LEVEL_15, method_15741(state));
    }
    
    public static class Flowing extends Mud {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends Mud {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

}