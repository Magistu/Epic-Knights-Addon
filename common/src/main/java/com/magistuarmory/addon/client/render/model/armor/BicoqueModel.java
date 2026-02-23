package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class BicoqueModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.975F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.8F))
				.texOffs(51, 10).addBox(-0.5F, -6.0F, -6.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 1).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -6.925F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3F, -8.0F, -5.8F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, 0.6F, -0.8F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 9).addBox(-2.95F, -6.0F, -6.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0F, -0.9F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 5).mirror().addBox(-2.6741F, 0.2853F, -0.0867F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7259F, -3.2853F, -6.5133F, 0.5236F, 0.3491F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 0).addBox(-2.6905F, -2.4511F, -0.4067F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6095F, -5.4239F, -6.2933F, -0.4328F, 0.3491F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.9F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(3.3F, -8.0F, -5.8F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.6F, -0.8F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 5).addBox(-1.3259F, 0.2853F, -0.0867F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7259F, -3.2853F, -6.5133F, 0.5236F, -0.3491F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 9).mirror().addBox(-1.05F, -6.0F, -6.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, -0.9F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-1.3095F, -2.4511F, -0.4067F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6095F, -5.4239F, -6.2933F, -0.4328F, -0.3491F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}