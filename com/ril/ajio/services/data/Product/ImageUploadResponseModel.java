/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.Intrinsics;

public final class ImageUploadResponseModel {
    private final String objectName;
    private final String uploadMethod;
    private final String url;

    public ImageUploadResponseModel(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "objectName");
        Intrinsics.checkNotNullParameter(string4, "uploadMethod");
        this.url = string2;
        this.objectName = string3;
        this.uploadMethod = string4;
    }

    public static /* synthetic */ ImageUploadResponseModel copy$default(ImageUploadResponseModel imageUploadResponseModel, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = imageUploadResponseModel.url;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = imageUploadResponseModel.objectName;
        }
        if ((n3 &= 4) != 0) {
            string4 = imageUploadResponseModel.uploadMethod;
        }
        return imageUploadResponseModel.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.objectName;
    }

    public final String component3() {
        return this.uploadMethod;
    }

    public final ImageUploadResponseModel copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "objectName");
        Intrinsics.checkNotNullParameter(string4, "uploadMethod");
        ImageUploadResponseModel imageUploadResponseModel = new ImageUploadResponseModel(string2, string3, string4);
        return imageUploadResponseModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageUploadResponseModel;
        if (!bl3) {
            return false;
        }
        object = (ImageUploadResponseModel)object;
        String string2 = this.url;
        String string3 = ((ImageUploadResponseModel)object).url;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.objectName;
        string3 = ((ImageUploadResponseModel)object).objectName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uploadMethod;
        object = ((ImageUploadResponseModel)object).uploadMethod;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getObjectName() {
        return this.objectName;
    }

    public final String getUploadMethod() {
        return this.uploadMethod;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.url.hashCode() * 31;
        String string2 = this.objectName;
        n3 = zy_2.b(n3, 31, string2);
        return this.uploadMethod.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.url;
        String string3 = this.objectName;
        String string4 = this.uploadMethod;
        return h30_0.a(og_1.a("ImageUploadResponseModel(url=", string2, ", objectName=", string3, ", uploadMethod="), string4, ")");
    }
}

