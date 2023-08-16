package net.adelheideatsalliums.frogson.Crops.blockClasses;

import net.adelheideatsalliums.frogson.Crops.CropItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TomatoBush  extends CropBlock {
    public static final int TOMATO_BUSH_MAX_AGE = 3;
    public static final IntProperty AGE;
    private static final VoxelShape[] AGE_TO_SHAPE;

    public TomatoBush(AbstractBlock.Settings settings) {
        super(settings);
    }

    protected IntProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return 3;
    }

    protected ItemConvertible getSeedsItem() {
        return CropItems.TOMATO_SEEDS;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(3) != 0) {
            super.randomTick(state, world, pos, random);
        }

    }

    protected int getGrowthAmount(World world) {
        return super.getGrowthAmount(world) / 3;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }

    static {
        AGE = Properties.AGE_3;
        AGE_TO_SHAPE = new VoxelShape[]{
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0)};
    }
}
