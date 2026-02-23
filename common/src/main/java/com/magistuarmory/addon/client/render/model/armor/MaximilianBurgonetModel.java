package com.magistuarmory.addon.client.render.model.armor;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MaximilianBurgonetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.85F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
				.texOffs(38, 6).addBox(-4.0F, -7.85F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = rmask.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(0.2213F, -2.1879F, 0.2902F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0134F, -27.2121F, -7.051F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = rmask.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 23).mirror().addBox(0.1461F, 0.8919F, 0.316F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.2539F, -27.7919F, -7.316F, 0.5323F, -0.4528F, 0.0115F));

		PartDefinition cube_r3 = rmask.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 23).addBox(-5.1461F, 0.8919F, 0.316F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2539F, -27.7919F, -7.316F, 0.5323F, 0.4528F, -0.0115F));

		PartDefinition cube_r4 = rmask.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 28).addBox(-5.2213F, -2.1879F, 0.2902F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.0134F, -27.2121F, -7.051F, 0.0F, 0.4363F, 0.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create().texOffs(0, 24).addBox(-5.0F, -29.4406F, -7.7549F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, -13).addBox(0.0F, -12.8F, -4.8F, 0.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 16).addBox(-1.0F, -7.0F, -9.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 2.0F, 0.2597F, -0.0338F, 0.1265F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}