package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class GreenwichArmetModel
{
	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Armet = head.addOrReplaceChild("Armet", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.05F, 0.8F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F))
		.texOffs(6, 6).addBox(0.0F, 0.05F, 0.3F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F)), PartPose.offset(-4.0F, -8.0F, -4.0F));

		PartDefinition VisorTopLeft = head.addOrReplaceChild("VisorTopLeft", CubeListBuilder.create().texOffs(47, 0).addBox(0.4F, 0.65F, -2.6F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, -0.7285F, -0.6829F, 0.0F));

		PartDefinition VisorTopLeft_r1 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r1", CubeListBuilder.create().texOffs(12, 14).addBox(-3.0F, -4.05F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(0.0F, -5.05F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 5.7F, -2.7F, 0.0F, 0.0F, 0.3927F));

		PartDefinition VisorTopRight = head.addOrReplaceChild("VisorTopRight", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-1.1F, -2.6F, 1.1F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, -0.7285F, 0.6374F, 0.0F));

		PartDefinition VisorTopRight_r1 = VisorTopRight.addOrReplaceChild("VisorTopRight_r1", CubeListBuilder.create().texOffs(8, 14).mirror().addBox(1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, 14).mirror().addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9F, 2.4F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition VisorBottomLeft = head.addOrReplaceChild("VisorBottomLeft", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(0.15F, -1.5F, -6.9F, 7.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, 0.6829F, -0.6829F, 0.0F));

		PartDefinition VisorBottomLeft_r1 = VisorBottomLeft.addOrReplaceChild("VisorBottomLeft_r1", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.05F, -1.0F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 26).mirror().addBox(0.95F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, -1.5F, -7.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition VisorBottomRight = head.addOrReplaceChild("VisorBottomRight", CubeListBuilder.create().texOffs(30, 0).addBox(-0.95F, 1.75F, -2.9F, 7.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r1 = VisorBottomRight.addOrReplaceChild("VisorBottomRight_r1", CubeListBuilder.create().texOffs(0, 26).addBox(0.05F, -1.05F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(56, 26).addBox(-2.95F, -0.05F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.8F, -3.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}