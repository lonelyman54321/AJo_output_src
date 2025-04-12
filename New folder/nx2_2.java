/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Nx2
 */
public final class nx2_2 {
    public static final /* synthetic */ int a;

    public static void a(Object object) {
        if (object != null) {
            return;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }
}

