package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class OpenedSalletModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.9F, -4.2F, 8.0F, 7.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Helmet_r1 = head.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(52, 26).addBox(-4.7F, -2.6F, -4.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0016F, -7.8803F, -4.8396F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Helmet_r2 = bone.addOrReplaceChild("Helmet_r2", CubeListBuilder.create().texOffs(12, 6).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3285F, 0.0197F, 1.2384F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Helmet_r3 = bone.addOrReplaceChild("Helmet_r3", CubeListBuilder.create().texOffs(12, 6).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3317F, 0.0197F, 1.2384F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition Helmet_r4 = bone.addOrReplaceChild("Helmet_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-9.3F, 5.6F, 1.67F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2516F, 5.2803F, 5.2396F, -1.789F, 0.0F, 1.5708F));

		PartDefinition Helmet_r5 = bone.addOrReplaceChild("Helmet_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-9.3F, 6.9F, -1.806F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2484F, 5.2803F, 5.2396F, -1.3526F, 0.0F, 1.5708F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}