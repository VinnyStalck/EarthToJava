package baunilla.earthtojava.common;

import baunilla.earthtojava.common.fluid.Mud;
import net.minecraft.fluid.BaseFluid;

public class EarthFluids {
    // Mud
    public static final BaseFluid STILL_MUD = new Mud.Still();
    public static final BaseFluid FLOWING_MUD = new Mud.Flowing();
}