/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Update$Package;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateTask$Update$Package$Finished
implements UpdateTask$Update$Package {
    private final boolean saved;
    private final FileProviderService$TempWriter tempWriter;

    public UpdateTask$Update$Package$Finished(FileProviderService$TempWriter fileProviderService$TempWriter, boolean bl2) {
        Intrinsics.checkNotNullParameter(fileProviderService$TempWriter, "tempWriter");
        this.tempWriter = fileProviderService$TempWriter;
        this.saved = bl2;
    }

    public final boolean getSaved() {
        return this.saved;
    }

    public final FileProviderService$TempWriter getTempWriter() {
        return this.tempWriter;
    }
}

