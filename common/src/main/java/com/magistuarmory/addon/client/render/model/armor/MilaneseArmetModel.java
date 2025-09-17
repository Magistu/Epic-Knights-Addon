package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class MilaneseArmetModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F))
				.texOffs(32, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(35, 18).addBox(-4.0F, -4.0F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 3.8F, 0.0F, 0.0F, 0.7854F));
		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rmask_r1 = rmask.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-2.5F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0956F, -27.5406F, -6.6199F, -1.1496F, 0.4648F, 0.0F));
		PartDefinition rmask_r2 = rmask.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-2.3F, -7.2F, -3.75F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, 0.6393F, 0.4648F, 0.0F));
		PartDefinition rmask_r3 = rmask.addOrReplaceChild("rmask_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.26F, -5.2094F, -0.7901F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3524F, -27.5406F, -5.9887F, -0.5163F, 0.2897F, -0.0894F));
		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lmask_r1 = lmask.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1067F, -27.5406F, -6.6144F, -1.1496F, -0.4648F, 0.0F));
		PartDefinition lmask_r2 = lmask.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(0, 5).addBox(-0.55F, -3.4665F, 1.2716F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.0F, -7.0F, 0.6393F, -0.4648F, 0.0F));
		PartDefinition lmask_r3 = lmask.addOrReplaceChild("lmask_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0142F, -5.2449F, 0.15F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.0F, -7.0F, -0.5165F, -0.3335F, 0.0896F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}