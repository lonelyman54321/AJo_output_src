/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.motion.widget;

public final class MotionLayout$g
extends Enum {
    private static final /* synthetic */ MotionLayout$g[] $VALUES;
    public static final /* enum */ MotionLayout$g FINISHED;
    public static final /* enum */ MotionLayout$g MOVING;
    public static final /* enum */ MotionLayout$g SETUP;
    public static final /* enum */ MotionLayout$g UNDEFINED;

    private static /* synthetic */ MotionLayout$g[] $values() {
        MotionLayout$g motionLayout$g = UNDEFINED;
        motionLayout$g = SETUP;
        motionLayout$g = MOVING;
        motionLayout$g = FINISHED;
        MotionLayout$g[] motionLayout$gArray = new MotionLayout$g[]{motionLayout$g, motionLayout$g, motionLayout$g, motionLayout$g};
        return motionLayout$gArray;
    }

    static {
        MotionLayout$g motionLayout$g;
        UNDEFINED = motionLayout$g = new MotionLayout$g("UNDEFINED", 0);
        SETUP = motionLayout$g = new MotionLayout$g("SETUP", 1);
        MOVING = motionLayout$g = new MotionLayout$g("MOVING", 2);
        FINISHED = motionLayout$g = new MotionLayout$g("FINISHED", 3);
        $VALUES = MotionLayout$g.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MotionLayout$g() {
        void var2_-1;
        void var1_-1;
    }

    public static MotionLayout$g valueOf(String string2) {
        return Enum.valueOf(MotionLayout$g.class, string2);
    }

    public static MotionLayout$g[] values() {
        return (MotionLayout$g[])$VALUES.clone();
    }
}

