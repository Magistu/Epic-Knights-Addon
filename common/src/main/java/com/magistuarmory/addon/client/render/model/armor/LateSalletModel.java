package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class LateSalletModel
{
	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.9F, -4.2F, 8.0F, 7.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Helmet_r1 = head.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-1.68F, 6.15F, -1.656F, 2.0F, 2.0F, 5.9F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(24, 0).mirror().addBox(-3.43F, 4.75F, -1.606F, 2.0F, 2.0F, 5.85F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.75F, 0.0F, -1.2686F, -0.7654F, -1.7545F));

		PartDefinition Helmet_r2 = head.addOrReplaceChild("Helmet_r2", CubeListBuilder.create().texOffs(24, 0).addBox(1.43F, 4.75F, -1.606F, 2.0F, 2.0F, 5.85F, new CubeDeformation(-0.1F))
		.texOffs(24, 0).addBox(-0.32F, 6.15F, -1.656F, 2.0F, 2.0F, 5.9F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.75F, 0.0F, -1.2686F, 0.7654F, 1.7545F));

		PartDefinition Helmet_r3 = head.addOrReplaceChild("Helmet_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(1.3F, 2.9F, -1.806F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.75F, 0.0F, -1.3526F, -0.1309F, -1.5708F));

		PartDefinition Helmet_r4 = head.addOrReplaceChild("Helmet_r4", CubeListBuilder.create().texOffs(12, 10).mirror().addBox(0.4F, 0.67F, 1.67F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.75F, 0.0F, -1.7943F, 0.2525F, -1.6564F));

		PartDefinition Helmet_r5 = head.addOrReplaceChild("Helmet_r5", CubeListBuilder.create().texOffs(12, 10).addBox(-3.4F, 0.67F, 1.67F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.75F, 0.0F, -1.7943F, -0.2525F, 1.6564F));

		PartDefinition Helmet_r6 = head.addOrReplaceChild("Helmet_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-9.3F, 2.9F, -1.806F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 0.0F, -1.3526F, 0.1309F, 1.5708F));

		PartDefinition Helmet_r7 = head.addOrReplaceChild("Helmet_r7", CubeListBuilder.create().texOffs(20, 11).addBox(-3.3F, -9.5F, -2.6F, 1.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -3.0F, 0.0F, 0.2618F, 1.5708F));

		PartDefinition Helmet_r8 = head.addOrReplaceChild("Helmet_r8", CubeListBuilder.create().texOffs(0, 22).addBox(-2.501F, -4.7F, -6.6F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -2.0071F, 0.2618F, 1.5708F));

		PartDefinition Helmet_r9 = head.addOrReplaceChild("Helmet_r9", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, -6.4F, -3.01F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1345F, 0.2618F, 1.5708F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}