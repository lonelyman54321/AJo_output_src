/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.ResultReceiver
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;

final class MediaSessionCompat$MediaSessionImplBase$Command {
    public final String command;
    public final Bundle extras;
    public final ResultReceiver stub;

    public MediaSessionCompat$MediaSessionImplBase$Command(String string2, Bundle bundle, ResultReceiver resultReceiver) {
        this.command = string2;
        this.extras = bundle;
        this.stub = resultReceiver;
    }
}

