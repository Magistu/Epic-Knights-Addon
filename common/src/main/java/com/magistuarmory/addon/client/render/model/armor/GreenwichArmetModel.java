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

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.85F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
				.texOffs(6, 6).addBox(-4.0F, -7.85F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F))
				.texOffs(10, 14).addBox(-4.5F, -8.6F, -4.5F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1957F, -4.3347F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -0.2F));

		PartDefinition VisorTopLeft = bone2.addOrReplaceChild("VisorTopLeft", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5247F, 2.2483F, -2.5207F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, -0.7285F, -0.6829F, 0.0F));

		PartDefinition VisorTopLeft_r1 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r1", CubeListBuilder.create().texOffs(12, 14).addBox(-3.1651F, -1.9425F, 0.0793F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 5.7F, -2.7F, 0.0F, 0.0F, 0.48F));

		PartDefinition VisorTopLeft_r2 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.063F, -3.2262F, 0.1582F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 5.7F, -2.7F, 0.0F, 0.0F, 0.3927F));

		PartDefinition VisorTopRight = bone2.addOrReplaceChild("VisorTopRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, -0.7285F, 0.6374F, 0.0F));

		PartDefinition VisorTopRight2 = bone2.addOrReplaceChild("VisorTopRight2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition VisorTopRight_r1 = VisorTopRight2.addOrReplaceChild("VisorTopRight_r1", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.937F, -3.2262F, 0.1582F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 5.7F, -2.7F, 0.0F, 0.0F, -0.3927F));

		PartDefinition VisorTopRight3 = bone2.addOrReplaceChild("VisorTopRight3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition VisorTopRight_r2 = VisorTopRight3.addOrReplaceChild("VisorTopRight_r2", CubeListBuilder.create().texOffs(12, 14).mirror().addBox(1.1651F, -1.9425F, 0.0793F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 5.7F, -2.7F, 0.0F, 0.0F, -0.48F));

		PartDefinition VisorTopRight4 = bone2.addOrReplaceChild("VisorTopRight4", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-7.4753F, 2.2483F, -2.5207F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, -0.7285F, 0.6829F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -0.1F));

		PartDefinition VisorBottomLeft = bone3.addOrReplaceChild("VisorBottomLeft", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-0.5611F, -2.4299F, -7.1118F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, 0.6829F, -0.6829F, 0.0F));

		PartDefinition VisorBottomLeft_r1 = VisorBottomLeft.addOrReplaceChild("VisorBottomLeft_r1", CubeListBuilder.create().texOffs(4, 20).mirror().addBox(-2.2017F, -2.3152F, -0.2835F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3F, -1.4F, -7.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition VisorBottomRight = bone3.addOrReplaceChild("VisorBottomRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r1 = VisorBottomRight.addOrReplaceChild("VisorBottomRight_r1", CubeListBuilder.create().texOffs(8, 21).addBox(-2.8F, -0.4383F, -0.2382F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 2.0F, -3.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition VisorBottomRight2 = bone3.addOrReplaceChild("VisorBottomRight2", CubeListBuilder.create().texOffs(30, 0).addBox(-6.4389F, -2.4299F, -7.1118F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r2 = VisorBottomRight2.addOrReplaceChild("VisorBottomRight_r2", CubeListBuilder.create().texOffs(4, 20).addBox(0.2017F, -2.3152F, -0.2835F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -1.4F, -7.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition VisorBottomRight3 = bone3.addOrReplaceChild("VisorBottomRight3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomLeft2 = bone3.addOrReplaceChild("VisorBottomLeft2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.0F, 1.0F, 0.6829F, -0.6829F, 0.0F));

		PartDefinition VisorBottomLeft_r2 = VisorBottomLeft2.addOrReplaceChild("VisorBottomLeft_r2", CubeListBuilder.create().texOffs(8, 21).mirror().addBox(0.8F, -0.4383F, -0.2382F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.0F, -3.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}