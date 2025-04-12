/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.appindexing;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.Action$Metadata$Builder;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzc;
import com.google.firebase.appindexing.internal.zzw;
import java.util.Arrays;

public class Action$Builder {
    public static final String ACTIVATE_ACTION = "ActivateAction";
    public static final String ADD_ACTION = "AddAction";
    public static final String BOOKMARK_ACTION = "BookmarkAction";
    public static final String COMMENT_ACTION = "CommentAction";
    public static final String LIKE_ACTION = "LikeAction";
    public static final String LISTEN_ACTION = "ListenAction";
    public static final String SEND_ACTION = "SendAction";
    public static final String SHARE_ACTION = "ShareAction";
    public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
    public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
    public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
    public static final String VIEW_ACTION = "ViewAction";
    public static final String WATCH_ACTION = "WatchAction";
    private final Bundle zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private zzb zzf;
    private String zzg;

    public Action$Builder(String string2) {
        Bundle bundle;
        this.zza = bundle = new Bundle();
        this.zzb = string2;
    }

    public Action build() {
        Object object = this.zzc;
        Object object2 = "setObject is required before calling build().";
        Preconditions.checkNotNull(object, object2);
        Preconditions.checkNotNull(this.zzd, object2);
        String string2 = this.zzb;
        String string3 = this.zzc;
        String string4 = this.zzd;
        String string5 = this.zze;
        object2 = this.zzf;
        if (object2 == null) {
            object2 = new Action$Metadata$Builder();
            object2 = ((Action$Metadata$Builder)object2).zza();
        }
        String string6 = this.zzg;
        Bundle bundle = this.zza;
        object = new zzc(string2, string3, string4, string5, (zzb)object2, string6, bundle);
        return object;
    }

    public Action$Builder put(String string2, double ... dArray) {
        Bundle bundle = this.zza;
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(dArray);
        int n3 = dArray.length;
        if (n3 > 0) {
            int n4 = 100;
            if (n3 >= n4) {
                String string3 = "Input Array of elements is too big, cutting off.";
                zzw.zza(string3);
                dArray = Arrays.copyOf(dArray, n4);
            }
            bundle.putDoubleArray(string2, dArray);
        } else {
            string2 = "Double array is empty and is ignored by put method.";
            zzw.zza(string2);
        }
        return this;
    }

    public Action$Builder put(String string2, long ... lArray) {
        IndexableBuilder.zzd(this.zza, string2, lArray);
        return this;
    }

    public Action$Builder put(String string2, Indexable ... indexableArray) {
        IndexableBuilder.zzb(this.zza, string2, indexableArray);
        return this;
    }

    public Action$Builder put(String string2, String ... stringArray) {
        IndexableBuilder.zza(this.zza, string2, stringArray);
        return this;
    }

    public Action$Builder put(String string2, boolean ... blArray) {
        IndexableBuilder.zzc(this.zza, string2, blArray);
        return this;
    }

    public Action$Builder setActionStatus(String string2) {
        Preconditions.checkNotNull(string2);
        this.zzg = string2;
        return this;
    }

    public Action$Builder setMetadata(Action$Metadata$Builder object) {
        Preconditions.checkNotNull(object);
        this.zzf = object = ((Action$Metadata$Builder)object).zza();
        return this;
    }

    public final Action$Builder setName(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        this.zzc = stringArray;
        stringArray = new String[]{stringArray};
        return this.put("name", stringArray);
    }

    public Action$Builder setObject(String string2, String string3) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(string3);
        this.zzc = string2;
        this.zzd = string3;
        return this;
    }

    public Action$Builder setObject(String string2, String string3, String string4) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(string3);
        Preconditions.checkNotNull(string4);
        this.zzc = string2;
        this.zzd = string3;
        this.zze = string4;
        return this;
    }

    public Action$Builder setResult(Indexable ... indexableArray) {
        return this.put("result", indexableArray);
    }

    public final Action$Builder setUrl(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        this.zzd = stringArray;
        stringArray = new String[]{stringArray};
        return this.put("url", stringArray);
    }

    public final String zza() {
        String string2 = this.zzc;
        if (string2 == null) {
            return null;
        }
        String string3 = new String(string2);
        return string3;
    }

    public final String zzb() {
        String string2 = this.zzd;
        if (string2 == null) {
            return null;
        }
        String string3 = new String(string2);
        return string3;
    }

    public final String zzc() {
        String string2 = this.zzg;
        String string3 = new String(string2);
        return string3;
    }
}

