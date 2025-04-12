/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

final class UpdateTask$Stage
extends Enum {
    private static final /* synthetic */ UpdateTask$Stage[] $VALUES;
    public static final /* enum */ UpdateTask$Stage DOWNLOADING_UPDATES;
    public static final /* enum */ UpdateTask$Stage FETCHING_RC;
    public static final /* enum */ UpdateTask$Stage FINISHED;
    public static final /* enum */ UpdateTask$Stage INITIALIZING;
    public static final /* enum */ UpdateTask$Stage INSTALLING;

    private static final /* synthetic */ UpdateTask$Stage[] $values() {
        UpdateTask$Stage updateTask$Stage = INITIALIZING;
        updateTask$Stage = FETCHING_RC;
        updateTask$Stage = DOWNLOADING_UPDATES;
        updateTask$Stage = INSTALLING;
        updateTask$Stage = FINISHED;
        UpdateTask$Stage[] updateTask$StageArray = new UpdateTask$Stage[]{updateTask$Stage, updateTask$Stage, updateTask$Stage, updateTask$Stage, updateTask$Stage};
        return updateTask$StageArray;
    }

    static {
        UpdateTask$Stage updateTask$Stage;
        INITIALIZING = updateTask$Stage = new UpdateTask$Stage("INITIALIZING", 0);
        FETCHING_RC = updateTask$Stage = new UpdateTask$Stage("FETCHING_RC", 1);
        DOWNLOADING_UPDATES = updateTask$Stage = new UpdateTask$Stage("DOWNLOADING_UPDATES", 2);
        INSTALLING = updateTask$Stage = new UpdateTask$Stage("INSTALLING", 3);
        FINISHED = updateTask$Stage = new UpdateTask$Stage("FINISHED", 4);
        $VALUES = UpdateTask$Stage.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UpdateTask$Stage() {
        void var2_-1;
        void var1_-1;
    }

    public static UpdateTask$Stage valueOf(String string2) {
        return Enum.valueOf(UpdateTask$Stage.class, string2);
    }

    public static UpdateTask$Stage[] values() {
        return (UpdateTask$Stage[])$VALUES.clone();
    }
}

