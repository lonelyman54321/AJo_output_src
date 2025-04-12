/*
 * Decompiled with CFR 0.152.
 */
public final class k70$c {
    public static final k70_0 a;

    static {
        mz0_2 mz0_22 = mz0_2.a;
        String string2 = "multipart";
        k70_0 k70_02 = new k70_0(string2, "*", mz0_22);
        new k70_0(string2, "mixed", mz0_22);
        new k70_0(string2, "alternative", mz0_22);
        new k70_0(string2, "related", mz0_22);
        a = k70_02 = new k70_0(string2, "form-data", mz0_22);
        new k70_0(string2, "signed", mz0_22);
        new k70_0(string2, "encrypted", mz0_22);
        new k70_0(string2, "byteranges", mz0_22);
    }
}

