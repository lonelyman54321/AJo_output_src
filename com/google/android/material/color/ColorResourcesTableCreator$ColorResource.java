/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

class ColorResourcesTableCreator$ColorResource {
    private final short entryId;
    private final String name;
    private final byte packageId;
    private final byte typeId;
    private final int value;

    public ColorResourcesTableCreator$ColorResource(int n3, String string2, int n4) {
        short s7;
        this.name = string2;
        this.value = n4;
        this.entryId = s7 = (short)((char)-1 & n3);
        s7 = (byte)(n3 >> 16 & 0xFF);
        this.typeId = (byte)s7;
        n3 = (byte)(n3 >> 24 & 0xFF);
        this.packageId = (byte)n3;
    }

    public static /* synthetic */ short access$000(ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource) {
        return colorResourcesTableCreator$ColorResource.entryId;
    }

    public static /* synthetic */ String access$100(ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource) {
        return colorResourcesTableCreator$ColorResource.name;
    }

    public static /* synthetic */ int access$1400(ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource) {
        return colorResourcesTableCreator$ColorResource.value;
    }

    public static /* synthetic */ byte access$200(ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource) {
        return colorResourcesTableCreator$ColorResource.typeId;
    }

    public static /* synthetic */ byte access$300(ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource) {
        return colorResourcesTableCreator$ColorResource.packageId;
    }
}

