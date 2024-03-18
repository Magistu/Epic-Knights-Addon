package com.magistuarmory.addon.client.render.model.decoration;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class SkirtModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition skirt1 = body.addOrReplaceChild("skirt1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = skirt1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r2 = skirt1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition skirt2 = body.addOrReplaceChild("skirt2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = skirt2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r4 = skirt2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 14).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition skirt3 = body.addOrReplaceChild("skirt3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r5 = skirt3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r6 = skirt3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 14).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition skirt4 = body.addOrReplaceChild("skirt4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r7 = skirt4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r8 = skirt4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition skirt5 = body.addOrReplaceChild("skirt5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r9 = skirt5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r10 = skirt5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 14).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition skirt6 = body.addOrReplaceChild("skirt6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r11 = skirt6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 1.7574F, 0.6981F, -0.7854F, -0.5236F));

		PartDefinition cube_r12 = skirt6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, 0.5F, -3.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, -12.8932F, -0.3815F, -0.6981F, -0.7854F, 0.5236F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}