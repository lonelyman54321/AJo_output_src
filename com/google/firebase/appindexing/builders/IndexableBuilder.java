/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.firebase.appindexing.builders;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.Indexable$Metadata$Builder;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzac;
import com.google.firebase.appindexing.internal.zzw;
import java.util.Arrays;

public abstract class IndexableBuilder {
    private final Bundle zza;
    private final String zzb;
    private zzac zzc;
    private String zzd;

    public IndexableBuilder(String string2) {
        Bundle bundle;
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotEmpty(string2);
        this.zza = bundle = new Bundle();
        this.zzb = string2;
    }

    public static void zza(Bundle bundle, String string2, String ... stringArray) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(stringArray);
        int n3 = stringArray.length;
        stringArray = Arrays.copyOf(stringArray, n3);
        n3 = stringArray.length;
        if (n3 > 0) {
            n3 = 0;
            int n4 = 0;
            int n7 = 0;
            while (true) {
                int n8 = stringArray.length;
                int n10 = 100;
                if (n4 >= (n8 = Math.min(n8, n10))) break;
                CharSequence charSequence = stringArray[n4];
                stringArray[n7] = charSequence;
                String string3 = stringArray[n4];
                String string4 = "String at ";
                if (string3 == null) {
                    n10 = 59;
                    charSequence = new StringBuilder(n10);
                    ((StringBuilder)charSequence).append(string4);
                    ((StringBuilder)charSequence).append(n4);
                    string3 = " is null and is ignored by put method.";
                    ((StringBuilder)charSequence).append(string3);
                    charSequence = ((StringBuilder)charSequence).toString();
                    zzw.zza((String)charSequence);
                } else {
                    n8 = ((String)charSequence).length();
                    if (n8 > (n10 = 20000)) {
                        int n14 = 53;
                        charSequence = new StringBuilder(n14);
                        ((StringBuilder)charSequence).append(string4);
                        ((StringBuilder)charSequence).append(n4);
                        string4 = " is too long, truncating string.";
                        ((StringBuilder)charSequence).append(string4);
                        zzw.zza(((StringBuilder)charSequence).toString());
                        charSequence = stringArray[n7];
                        int n15 = ((String)charSequence).length();
                        if (n15 > n10) {
                            n15 = 19999;
                            n14 = (int)(Character.isHighSurrogate(((String)charSequence).charAt(n15)) ? 1 : 0);
                            if (n14 != 0 && (n14 = (int)(Character.isLowSurrogate(((String)charSequence).charAt(n10)) ? 1 : 0)) != 0) {
                                n10 = 19999;
                            }
                            charSequence = ((String)charSequence).substring(0, n10);
                        }
                        stringArray[n7] = charSequence;
                    }
                    ++n7;
                }
                ++n4;
            }
            if (n7 > 0) {
                stringArray = (String[])IndexableBuilder.zzf(Arrays.copyOfRange(stringArray, 0, n7));
                bundle.putStringArray(string2, stringArray);
            }
            return;
        }
        zzw.zza("String array is empty and is ignored by put method.");
    }

    public static void zzb(Bundle object, String string2, Indexable ... indexableArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(indexableArray);
        int n4 = indexableArray.length;
        Thing[] thingArray = new Thing[n4];
        for (int i3 = 0; i3 < (n3 = indexableArray.length); ++i3) {
            boolean bl2;
            Indexable indexable = indexableArray[i3];
            if (indexable != null && !(bl2 = indexable instanceof Thing)) {
                object = new FirebaseAppIndexingInvalidArgumentException("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
                throw object;
            }
            indexable = (Thing)indexable;
            thingArray[i3] = indexable;
        }
        IndexableBuilder.zze(object, string2, thingArray);
    }

    public static void zzc(Bundle bundle, String string2, boolean ... blArray) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(blArray);
        int n3 = blArray.length;
        if (n3 > 0) {
            int n4 = 100;
            if (n3 >= n4) {
                String string3 = "Input Array of elements is too big, cutting off.";
                zzw.zza(string3);
                blArray = Arrays.copyOf(blArray, n4);
            }
            bundle.putBooleanArray(string2, blArray);
            return;
        }
        zzw.zza("Boolean array is empty and is ignored by put method.");
    }

    public static void zzd(Bundle bundle, String string2, long ... lArray) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(lArray);
        int n3 = lArray.length;
        if (n3 > 0) {
            int n4 = 100;
            if (n3 >= n4) {
                String string3 = "Input Array of elements is too big, cutting off.";
                zzw.zza(string3);
                lArray = Arrays.copyOf(lArray, n4);
            }
            bundle.putLongArray(string2, lArray);
            return;
        }
        zzw.zza("Long array is empty and is ignored by put method.");
    }

    private static void zze(Bundle bundle, String string2, Thing ... thingArray) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(thingArray);
        int n3 = thingArray.length;
        if (n3 > 0) {
            int n4;
            n3 = 0;
            int n7 = 0;
            for (int i3 = 0; i3 < (n4 = thingArray.length); ++i3) {
                Object object = thingArray[i3];
                thingArray[n7] = object;
                object = thingArray[i3];
                if (object == null) {
                    int n8 = 58;
                    object = new StringBuilder(n8);
                    ((StringBuilder)object).append("Thing at ");
                    ((StringBuilder)object).append(i3);
                    String string3 = " is null and is ignored by put method.";
                    ((StringBuilder)object).append(string3);
                    object = ((StringBuilder)object).toString();
                    zzw.zza((String)object);
                    continue;
                }
                ++n7;
            }
            if (n7 > 0) {
                thingArray = (Parcelable[])IndexableBuilder.zzf(Arrays.copyOfRange(thingArray, 0, n7));
                bundle.putParcelableArray(string2, (Parcelable[])thingArray);
            }
            return;
        }
        zzw.zza("Thing array is empty and is ignored by put method.");
    }

    private static Object[] zzf(Object[] objectArray) {
        int n3 = objectArray.length;
        int n4 = 100;
        if (n3 < n4) {
            return objectArray;
        }
        zzw.zza("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objectArray, n4);
    }

    public final Indexable build() {
        Object object = this.zza;
        Bundle bundle = new Bundle((Bundle)object);
        object = this.zzc;
        if (object == null) {
            object = new Indexable$Metadata$Builder();
            object = ((Indexable$Metadata$Builder)object).zza();
        }
        String string2 = this.zzd;
        String string3 = this.zzb;
        Thing thing = new Thing(bundle, (zzac)object, string2, string3);
        return thing;
    }

    public IndexableBuilder put(String string2, long ... lArray) {
        IndexableBuilder.zzd(this.zza, string2, lArray);
        return this;
    }

    public IndexableBuilder put(String string2, Indexable ... indexableArray) {
        IndexableBuilder.zzb(this.zza, string2, indexableArray);
        return this;
    }

    public IndexableBuilder put(String string2, IndexableBuilder ... bundle) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(bundle);
        int n3 = ((IndexableBuilder[])bundle).length;
        if (n3 > 0) {
            int n4;
            Thing[] thingArray = new Thing[n3];
            for (int i3 = 0; i3 < (n4 = ((IndexableBuilder[])bundle).length); ++i3) {
                Object object = bundle[i3];
                if (object == null) {
                    int n7 = 60;
                    object = new StringBuilder(n7);
                    ((StringBuilder)object).append("Builder at ");
                    ((StringBuilder)object).append(i3);
                    String string3 = " is null and is ignored by put method.";
                    ((StringBuilder)object).append(string3);
                    object = ((StringBuilder)object).toString();
                    zzw.zza((String)object);
                    continue;
                }
                thingArray[i3] = object = (Thing)((IndexableBuilder)object).build();
            }
            bundle = this.zza;
            IndexableBuilder.zze(bundle, string2, thingArray);
        } else {
            string2 = "Builder array is empty and is ignored by put method.";
            zzw.zza(string2);
        }
        return this;
    }

    public IndexableBuilder put(String string2, String ... stringArray) {
        IndexableBuilder.zza(this.zza, string2, stringArray);
        return this;
    }

    public IndexableBuilder put(String string2, boolean ... blArray) {
        IndexableBuilder.zzc(this.zza, string2, blArray);
        return this;
    }

    public IndexableBuilder setAlternateName(String ... stringArray) {
        Preconditions.checkNotNull(stringArray);
        return this.put("alternateName", stringArray);
    }

    public final IndexableBuilder setDescription(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = new String[]{stringArray};
        return this.put("description", stringArray);
    }

    public IndexableBuilder setId(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = new String[]{stringArray};
        return this.put("id", stringArray);
    }

    public final IndexableBuilder setImage(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = new String[]{stringArray};
        return this.put("image", stringArray);
    }

    public final IndexableBuilder setIsPartOf(IndexableBuilder ... indexableBuilderArray) {
        Preconditions.checkNotNull(indexableBuilderArray);
        return this.put("isPartOf", indexableBuilderArray);
    }

    public final IndexableBuilder setKeywords(String ... stringArray) {
        return this.put("keywords", stringArray);
    }

    public IndexableBuilder setMetadata(Indexable$Metadata$Builder object) {
        boolean bl2;
        zzac zzac2 = this.zzc;
        if (zzac2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzac2 = null;
        }
        Preconditions.checkState(bl2, "setMetadata may only be called once");
        Preconditions.checkNotNull(object);
        this.zzc = object = ((Indexable$Metadata$Builder)object).zza();
        return this;
    }

    public final IndexableBuilder setName(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = new String[]{stringArray};
        return this.put("name", stringArray);
    }

    public final IndexableBuilder setSameAs(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = new String[]{stringArray};
        return this.put("sameAs", stringArray);
    }

    public final IndexableBuilder setUrl(String string2) {
        Preconditions.checkNotNull(string2);
        this.zzd = string2;
        return this;
    }
}

