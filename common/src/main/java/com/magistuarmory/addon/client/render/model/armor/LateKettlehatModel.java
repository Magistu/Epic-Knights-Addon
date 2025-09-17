package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class LateKettlehatModel
{

	public LateKettlehatModel() {
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r1 = head.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(-3, 3).mirror().addBox(-8.0F, -0.1F, -2.8F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.6F, 4.9F, 0.6981F, -3.1416F, 0.0F));

		PartDefinition bone_r2 = head.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(-3, 3).addBox(-8.0F, -0.1F, -2.8F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6F, 4.9F, 0.6981F, 3.1416F, 0.0F));

		PartDefinition bone_r3 = head.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(-3, 0).mirror().addBox(-7.9F, -0.1F, -2.8F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -5.6F, 0.1F, 0.0F, 1.5708F, -0.6981F));

		PartDefinition bone_r4 = head.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(-3, 0).addBox(-8.1F, -0.1F, -2.8F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.6F, 0.1F, 0.0F, -1.5708F, 0.6981F));

		PartDefinition bone_r5 = head.addOrReplaceChild("bone_r5", CubeListBuilder.create().texOffs(-3, 3).addBox(-8.0F, -0.6F, -2.4F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}