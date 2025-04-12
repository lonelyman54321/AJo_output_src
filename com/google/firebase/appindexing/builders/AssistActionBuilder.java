/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.Action$Builder;

public final class AssistActionBuilder
extends Action$Builder {
    private String zza;

    public AssistActionBuilder() {
        super("AssistAction");
    }

    public Action build() {
        Preconditions.checkNotNull(this.zza, "setActionToken is required before calling build().");
        Preconditions.checkNotNull(this.zzc(), "setActionStatus is required before calling build().");
        Object object = this.zza;
        object = new String[]{object};
        String string2 = "actionToken";
        this.put(string2, (String[])object);
        object = this.zza();
        if (object == null) {
            object = "AssistAction";
            this.setName((String)object);
        }
        if ((object = this.zzb()) == null) {
            object = String.valueOf(this.zza);
            int n3 = ((String)object).length();
            String string3 = "https://developers.google.com/actions?invocation=";
            object = n3 != 0 ? string3.concat((String)object) : new String(string3);
            this.setUrl((String)object);
        }
        return super.build();
    }

    public AssistActionBuilder setActionToken(String string2) {
        Preconditions.checkNotNull(string2);
        this.zza = string2;
        return this;
    }
}

