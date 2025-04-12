/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.services;

final class FileProviderService$Mode
extends Enum {
    private static final /* synthetic */ FileProviderService$Mode[] $VALUES;
    public static final /* enum */ FileProviderService$Mode NEW;
    public static final /* enum */ FileProviderService$Mode RE_OPEN;

    private static /* synthetic */ FileProviderService$Mode[] $values() {
        FileProviderService$Mode fileProviderService$Mode = NEW;
        fileProviderService$Mode = RE_OPEN;
        FileProviderService$Mode[] fileProviderService$ModeArray = new FileProviderService$Mode[]{fileProviderService$Mode, fileProviderService$Mode};
        return fileProviderService$ModeArray;
    }

    static {
        FileProviderService$Mode fileProviderService$Mode;
        NEW = fileProviderService$Mode = new FileProviderService$Mode("NEW", 0);
        RE_OPEN = fileProviderService$Mode = new FileProviderService$Mode("RE_OPEN", 1);
        $VALUES = FileProviderService$Mode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FileProviderService$Mode() {
        void var2_-1;
        void var1_-1;
    }

    public static FileProviderService$Mode valueOf(String string2) {
        return Enum.valueOf(FileProviderService$Mode.class, string2);
    }

    public static FileProviderService$Mode[] values() {
        return (FileProviderService$Mode[])$VALUES.clone();
    }
}

