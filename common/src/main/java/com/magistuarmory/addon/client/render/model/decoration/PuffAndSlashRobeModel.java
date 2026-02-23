package com.magistuarmory.addon.client.render.model.decoration;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class PuffAndSlashRobeModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition skirt1 = body.addOrReplaceChild("skirt1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = skirt1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(0.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1893F, -11.1926F, 1.576F, -0.2793F, 0.7854F, -0.192F));

		PartDefinition cube_r2 = skirt1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-3.4438F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -13.1926F, -2.424F, -1.3666F, 1.4706F, -1.1546F));

		PartDefinition cube_r3 = skirt1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(0.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -11.1926F, 1.576F, -0.377F, 1.0405F, -0.2264F));

		PartDefinition cube_r4 = skirt1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-3.4438F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1893F, -13.1926F, -1.424F, -3.0213F, 0.7418F, -2.7844F));

		PartDefinition cube_r5 = skirt1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5562F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1893F, -13.1926F, -1.424F, -3.0312F, -0.6834F, 2.7833F));

		PartDefinition cube_r6 = skirt1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5562F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1893F, -13.1926F, -2.424F, -1.3666F, -1.4706F, 1.1546F));

		PartDefinition cube_r7 = skirt1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 0).addBox(-4.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1893F, -11.1926F, 1.576F, -0.377F, -1.0405F, 0.2264F));

		PartDefinition cube_r8 = skirt1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 0).addBox(-4.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1893F, -11.1926F, 1.576F, -0.2793F, -0.7854F, 0.192F));

		PartDefinition skirt2 = body.addOrReplaceChild("skirt2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 1.0F, 3.0941F, 0.0329F, -3.1234F));

		PartDefinition cube_r9 = skirt2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 14).mirror().addBox(0.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1893F, -11.1926F, 1.576F, -0.2793F, 0.7854F, -0.192F));

		PartDefinition cube_r10 = skirt2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 14).mirror().addBox(-3.4438F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -13.1926F, -2.424F, -1.3666F, 1.4706F, -1.1546F));

		PartDefinition cube_r11 = skirt2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 14).mirror().addBox(0.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -11.1926F, 1.576F, -0.377F, 1.0405F, -0.2264F));

		PartDefinition cube_r12 = skirt2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 14).mirror().addBox(-3.4438F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1893F, -13.1926F, -1.424F, -3.1389F, 0.712F, -2.8511F));

		PartDefinition cube_r13 = skirt2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 14).addBox(-0.5562F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1893F, -13.1926F, -1.424F, -3.0853F, -0.6965F, 2.8206F));

		PartDefinition cube_r14 = skirt2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 14).addBox(-0.5562F, -0.5861F, -2.2411F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1893F, -13.1926F, -2.424F, -1.3666F, -1.4706F, 1.1546F));

		PartDefinition cube_r15 = skirt2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 14).addBox(-4.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1893F, -11.1926F, 1.576F, -0.377F, -1.0405F, 0.2264F));

		PartDefinition cube_r16 = skirt2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 14).addBox(-4.8119F, -2.1067F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1893F, -11.1926F, 1.576F, -0.2793F, -0.7854F, 0.192F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(10, 8).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.8F))
				.texOffs(40, 4).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.5F))
				.texOffs(24, 4).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.65F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(10, 8).mirror().addBox(0.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false)
				.texOffs(24, 4).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.65F)).mirror(false)
				.texOffs(40, 4).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}