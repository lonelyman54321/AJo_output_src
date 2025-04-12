/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tG1
 */
public final class tg1_1 {
    public static final ug1_1 a;

    static {
        Object object = wx1_2.b();
        if (object != null) {
            a = object = object.c();
        } else {
            hj2_2.a("Failed to find provider.");
            hj2_2.a("Defaulting to no-operation MDCAdapter implementation.");
            a = object = new Object();
        }
    }
}

