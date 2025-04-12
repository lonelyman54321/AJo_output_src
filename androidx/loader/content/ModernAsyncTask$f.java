/*
 * Decompiled with CFR 0.152.
 */
package androidx.loader.content;

public final class ModernAsyncTask$f
extends Enum {
    private static final /* synthetic */ ModernAsyncTask$f[] $VALUES;
    public static final /* enum */ ModernAsyncTask$f FINISHED;
    public static final /* enum */ ModernAsyncTask$f PENDING;
    public static final /* enum */ ModernAsyncTask$f RUNNING;

    static {
        ModernAsyncTask$f modernAsyncTask$f;
        ModernAsyncTask$f modernAsyncTask$f2;
        ModernAsyncTask$f modernAsyncTask$f3;
        PENDING = modernAsyncTask$f3 = new ModernAsyncTask$f("PENDING", 0);
        int n3 = 1;
        RUNNING = modernAsyncTask$f2 = new ModernAsyncTask$f("RUNNING", n3);
        int n4 = 2;
        FINISHED = modernAsyncTask$f = new ModernAsyncTask$f("FINISHED", n4);
        ModernAsyncTask$f[] modernAsyncTask$fArray = new ModernAsyncTask$f[3];
        modernAsyncTask$fArray[0] = modernAsyncTask$f3;
        modernAsyncTask$fArray[n3] = modernAsyncTask$f2;
        modernAsyncTask$fArray[n4] = modernAsyncTask$f;
        $VALUES = modernAsyncTask$fArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ModernAsyncTask$f() {
        void var2_-1;
        void var1_-1;
    }

    public static ModernAsyncTask$f valueOf(String string2) {
        return Enum.valueOf(ModernAsyncTask$f.class, string2);
    }

    public static ModernAsyncTask$f[] values() {
        return (ModernAsyncTask$f[])$VALUES.clone();
    }
}

