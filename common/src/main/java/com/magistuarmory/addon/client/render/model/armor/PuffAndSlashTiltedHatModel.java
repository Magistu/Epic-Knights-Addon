package com.magistuarmory.addon.client.render.model.armor;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class PuffAndSlashTiltedHatModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.5F, -4.15F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.65F))
				.texOffs(32, 0).addBox(-4.0F, -8.5F, -4.15F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-3.1042F, -1.4441F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-5.6585F, -7.0118F, -3.9165F, 0.0F, 0.0F, 0.9774F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(0, 20).addBox(0.7F, -1.2323F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(4.5343F, -4.5078F, -3.9165F, 0.0F, 0.0F, -0.4887F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(24, 19).addBox(-10.3F, -0.2323F, -1.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(5.1504F, -5.6782F, -3.9165F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(31, 28).addBox(-10.3F, -0.2323F, 0.9921F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(5.0F, -5.0F, 4.167F, 0.6981F, 0.0F, 0.2182F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(31, 28).addBox(-10.3F, -0.2323F, -3.9921F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(5.0F, -5.0F, -4.0F, -0.6981F, 0.0F, 0.2182F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}