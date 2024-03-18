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

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition VisorTopLeft = bone2.addOrReplaceChild("VisorTopLeft", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, 2.45F, -2.3F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, -0.7285F, -0.6829F, 0.0F));

		PartDefinition VisorTopLeft_r1 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r1", CubeListBuilder.create().texOffs(12, 14).addBox(-3.05F, -1.775F, 0.3F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 5.7F, -2.7F, 0.0F, 0.0F, 0.48F));

		PartDefinition VisorTopLeft_r2 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r2", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -3.1F, 0.3F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 5.7F, -2.7F, 0.0F, 0.0F, 0.3927F));

		PartDefinition VisorTopRight = bone2.addOrReplaceChild("VisorTopRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, -0.7285F, 0.6374F, 0.0F));

		PartDefinition VisorTopRight_r1 = VisorTopRight.addOrReplaceChild("VisorTopRight_r1", CubeListBuilder.create().texOffs(4, 14).mirror().addBox(-2.0F, -3.1F, 0.3F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9F, 2.4F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition VisorTopRight2 = bone2.addOrReplaceChild("VisorTopRight2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition VisorTopRight3 = bone2.addOrReplaceChild("VisorTopRight3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition VisorTopRight_r2 = VisorTopRight3.addOrReplaceChild("VisorTopRight_r2", CubeListBuilder.create().texOffs(12, 14).mirror().addBox(1.05F, -1.775F, 0.3F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 5.7F, -2.7F, 0.0F, 0.0F, -0.48F));

		PartDefinition VisorTopRight4 = bone2.addOrReplaceChild("VisorTopRight4", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-7.5F, 2.45F, -2.3F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition VisorBottomLeft = bone3.addOrReplaceChild("VisorBottomLeft", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.5027F, -2.6733F, -7.1382F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, 0.6829F, -0.6829F, 0.0F));

		PartDefinition VisorBottomLeft_r1 = VisorBottomLeft.addOrReplaceChild("VisorBottomLeft_r1", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(0.8241F, -1.3883F, -0.2382F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 20).mirror().addBox(-2.1759F, -2.3883F, -0.2382F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 21).mirror().addBox(0.8241F, -0.3883F, -0.2382F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, -1.5F, -7.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition VisorBottomRight = bone3.addOrReplaceChild("VisorBottomRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r1 = VisorBottomRight.addOrReplaceChild("VisorBottomRight_r1", CubeListBuilder.create().texOffs(8, 21).addBox(-2.8F, -0.4383F, -0.2382F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.8F, -3.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition VisorBottomRight2 = bone3.addOrReplaceChild("VisorBottomRight2", CubeListBuilder.create().texOffs(30, 10).addBox(-6.4973F, -2.6733F, -7.1382F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight3 = bone3.addOrReplaceChild("VisorBottomRight3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r2 = VisorBottomRight3.addOrReplaceChild("VisorBottomRight_r2", CubeListBuilder.create().texOffs(4, 20).addBox(0.1759F, -2.3883F, -0.2382F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -1.5F, -7.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}