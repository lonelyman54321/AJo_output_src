/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzeb;
import com.google.android.gms.internal.icing.zzee;

final class zzeo
implements zzeb {
    private final zzee zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzeo(zzee object, String object2, Object[] object3) {
        Object[] objectArray;
        block13: {
            block14: {
                int n3;
                int n4;
                int n7;
                int n8 = 13;
                int n10 = 0;
                int n14 = 1;
                this.zza = object;
                this.zzb = object2;
                this.zzc = object3;
                try {
                    n7 = ((String)object2).charAt(0);
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    object = ((String)object2).toCharArray();
                    object2 = new String((char[])object);
                    try {
                        n7 = ((String)object2).charAt(0);
                    }
                    catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException2) {
                        try {
                            n4 = ((String)object2).length();
                            object3 = new char[n4];
                            n3 = ((String)object2).length();
                            ((String)object2).getChars(0, n3, (char[])object3, 0);
                            super((char[])object3);
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            break block13;
                        }
                        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException3) {
                            // empty catch block
                            break block13;
                        }
                        try {
                            n7 = objectArray.charAt(0);
                            object2 = objectArray;
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            break block14;
                        }
                        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException4) {
                            // empty catch block
                            break block14;
                        }
                    }
                }
                n4 = 55296;
                if (n7 < n4) {
                    this.zzd = n7;
                    return;
                }
                n7 &= 0x1FFF;
                n10 = 1;
                n3 = 13;
                while (true) {
                    int n15 = n10 + 1;
                    if ((n10 = (int)((String)object2).charAt(n10)) < n4) {
                        int n16 = n10 << n3;
                        this.zzd = n7 |= n16;
                        return;
                    }
                    n10 = (n10 & 0x1FFF) << n3;
                    n7 |= n10;
                    n3 += n8;
                    n10 = n15;
                }
            }
            object3 = object2;
            object2 = objectArray;
        }
        object = ((Object)object).length;
        objectArray = new Object[2];
        objectArray[0] = object2;
        objectArray[n14] = object;
        object = String.format("Failed parsing '%s' with charArray.length of %d", objectArray);
        IllegalStateException illegalStateException = new IllegalStateException((String)object, (Throwable)object3);
        throw illegalStateException;
    }

    public final boolean zza() {
        int n3 = this.zzd;
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final zzee zzb() {
        return this.zza;
    }

    public final int zzc() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) == n4) {
            return n4;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

