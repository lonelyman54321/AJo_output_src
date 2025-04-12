/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zza;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;
import java.util.Objects;

public final class CloudMessage
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    final Intent zza;
    private Map zzb;

    static {
        zza zza2 = new zza();
        CREATOR = zza2;
    }

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    private static int zzb(String string2) {
        String string3 = "high";
        boolean bl2 = Objects.equals(string2, string3);
        if (bl2) {
            return 1;
        }
        string3 = "normal";
        boolean bl3 = Objects.equals(string2, string3);
        if (bl3) {
            return 2;
        }
        return 0;
    }

    public String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map getData() {
        synchronized (this) {
            block8: {
                block6: {
                    block7: {
                        try {
                            var1_1 = this.zzb;
                            if (var1_1 != null) return this.zzb;
                            var1_1 = this.zza;
                            var1_1 = var1_1.getExtras();
                            var2_3 = new Jp();
                            if (var1_1 == null) break block6;
                            var3_4 = var1_1.keySet();
                            var3_4 = var3_4.iterator();
lbl11:
                            // 4 sources

                            while (var4_5 = var3_4.hasNext()) {
                                var5_6 = var3_4.next();
                                break block7;
                            }
                            break block6;
                        }
                        catch (Throwable var1_2) {
                            break block8;
                        }
                    }
                    var6_7 = var1_1.get((String)(var5_6 = (String)var5_6));
                    var7_8 = var6_7 instanceof String;
                    if (!var7_8) ** GOTO lbl11
                    var6_7 = (String)var6_7;
                    var8_9 = "google.";
                    var7_8 = var5_6.startsWith(var8_9);
                    if (var7_8 || (var7_8 = var5_6.equals(var8_9 = "from")) || (var7_8 = var5_6.equals(var8_9 = "message_type")) || (var7_8 = var5_6.equals(var8_9 = "collapse_key"))) ** GOTO lbl11
                    var2_3.put(var5_6, var6_7);
                    ** GOTO lbl11
                }
                this.zzb = var2_3;
                return this.zzb;
            }
            throw var1_2;
        }
    }

    public String getFrom() {
        return this.zza.getStringExtra("from");
    }

    public Intent getIntent() {
        return this.zza;
    }

    public String getMessageId() {
        Object object = this.zza;
        String string2 = "google.message_id";
        if ((object = object.getStringExtra(string2)) == null) {
            object = this.zza;
            string2 = "message_id";
            object = object.getStringExtra(string2);
        }
        return object;
    }

    public String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        Object object = this.zza;
        String string2 = "google.original_priority";
        if ((object = object.getStringExtra(string2)) == null) {
            object = this.zza;
            string2 = "google.priority";
            object = object.getStringExtra(string2);
        }
        return CloudMessage.zzb((String)object);
    }

    public int getPriority() {
        Object object = this.zza;
        String string2 = "google.delivered_priority";
        if ((object = object.getStringExtra(string2)) == null) {
            object = this.zza.getStringExtra("google.priority_reduced");
            boolean bl2 = Objects.equals(object, string2 = "1");
            if (bl2) {
                return 2;
            }
            object = this.zza;
            string2 = "google.priority";
            object = object.getStringExtra(string2);
        }
        return CloudMessage.zzb((String)object);
    }

    public byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    public String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        String string2;
        Object object = this.zza.getExtras();
        if (object != null) {
            string2 = "google.sent_time";
            object = object.get(string2);
        } else {
            object = null;
        }
        boolean bl2 = object instanceof Long;
        if (bl2) {
            return (Long)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            string2 = object;
            string2 = (String)object;
            try {
                return Long.parseLong(string2);
            }
            catch (NumberFormatException numberFormatException) {
                object = String.valueOf(object);
                string2 = "Invalid sent time: ";
                string2.concat((String)object);
            }
        }
        return 0L;
    }

    public String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl() {
        String string2;
        Object object = this.zza.getExtras();
        if (object != null) {
            string2 = "google.ttl";
            object = object.get(string2);
        } else {
            object = null;
        }
        boolean bl2 = object instanceof Integer;
        if (bl2) {
            return (Integer)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            string2 = object;
            string2 = (String)object;
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                object = String.valueOf(object);
                string2 = "Invalid TTL: ";
                string2.concat((String)object);
            }
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Intent intent = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)intent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final Integer zza() {
        Intent intent = this.zza;
        String string2 = "google.product_id";
        boolean bl2 = intent.hasExtra(string2);
        if (bl2) {
            return this.zza.getIntExtra(string2, 0);
        }
        return null;
    }
}

