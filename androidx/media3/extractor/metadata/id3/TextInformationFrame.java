/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame$a;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class TextInformationFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final ImmutableList c;

    static {
        TextInformationFrame$a textInformationFrame$a = new Object();
        CREATOR = textInformationFrame$a;
    }

    public TextInformationFrame(String object, String string2, ImmutableList immutableList) {
        super((String)object);
        ct3.a(immutableList.isEmpty() ^ true);
        this.b = string2;
        this.c = object = ImmutableList.copyOf((Collection)immutableList);
        object = (String)object.get(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList a(String object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        try {
            int n3 = ((String)object).length();
            int n4 = 5;
            int n7 = 10;
            int n8 = 7;
            int n10 = 4;
            if (n3 >= n7) {
                Object object2 = ((String)object).substring(0, n10);
                n3 = Integer.parseInt((String)object2);
                object2 = n3;
                arrayList.add(object2);
                object2 = ((String)object).substring(n4, n8);
                n3 = Integer.parseInt((String)object2);
                object2 = n3;
                arrayList.add(object2);
                n3 = 8;
                object = ((String)object).substring(n3, n7);
                int n14 = Integer.parseInt((String)object);
                object = n14;
                arrayList.add(object);
                return arrayList;
            }
            n3 = ((String)object).length();
            if (n3 >= n8) {
                Object object3 = ((String)object).substring(0, n10);
                n3 = Integer.parseInt((String)object3);
                object3 = n3;
                arrayList.add(object3);
                object = ((String)object).substring(n4, n8);
                int n15 = Integer.parseInt((String)object);
                object = n15;
                arrayList.add(object);
                return arrayList;
            }
            n3 = ((String)object).length();
            if (n3 < n10) return arrayList;
            object = ((String)object).substring(0, n10);
            int n16 = Integer.parseInt((String)object);
            object = n16;
            arrayList.add(object);
            return arrayList;
        }
        catch (NumberFormatException numberFormatException) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = TextInformationFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (TextInformationFrame)object;
            int n3 = gz3.a;
            object2 = this.a;
            object3 = ((Id3Frame)object).a;
            n3 = (int)(Objects.equals(object2, object3) ? 1 : 0);
            if (n3 == 0 || (n3 = (int)(Objects.equals(object2 = this.b, object3 = ((TextInformationFrame)object).b) ? 1 : 0)) == 0 || !(bl3 = ((ImmutableList)(object2 = this.c)).equals(object = ((TextInformationFrame)object).c))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = 527;
        int n4 = 31;
        int n7 = zy_2.b(n3, n4, string2);
        String string3 = this.b;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n7 = (n7 + n3) * 31;
        return this.c.hashCode() + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(": description=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(": values=");
        object = this.c;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(e$a e$a) {
        int n3;
        int n4 = 4;
        Object object = this.a;
        object.getClass();
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        ImmutableList immutableList = this.c;
        int n14 = -1;
        int n15 = ((String)object).hashCode();
        switch (n15) {
            default: {
                break;
            }
            case 2590194: {
                String string2 = "TYER";
                n3 = ((String)object).equals(string2);
                if (n3 == 0) break;
                n14 = 22;
                break;
            }
            case 2583398: {
                String string3 = "TRCK";
                n3 = ((String)object).equals(string3);
                if (n3 == 0) break;
                n14 = 21;
                break;
            }
            case 2581514: {
                String string4 = "TPE3";
                n3 = ((String)object).equals(string4);
                if (n3 == 0) break;
                n14 = 20;
                break;
            }
            case 2581513: {
                String string5 = "TPE2";
                n3 = ((String)object).equals(string5);
                if (n3 == 0) break;
                n14 = 19;
                break;
            }
            case 2581512: {
                String string6 = "TPE1";
                n3 = ((String)object).equals(string6);
                if (n3 == 0) break;
                n14 = 18;
                break;
            }
            case 2575251: {
                String string7 = "TIT2";
                n3 = ((String)object).equals(string7);
                if (n3 == 0) break;
                n14 = 17;
                break;
            }
            case 2571565: {
                String string8 = "TEXT";
                n3 = ((String)object).equals(string8);
                if (n3 == 0) break;
                n14 = 16;
                break;
            }
            case 2570410: {
                String string9 = "TDRL";
                n3 = ((String)object).equals(string9);
                if (n3 == 0) break;
                n14 = 15;
                break;
            }
            case 2570401: {
                String string10 = "TDRC";
                n3 = ((String)object).equals(string10);
                if (n3 == 0) break;
                n14 = 14;
                break;
            }
            case 2569891: {
                String string11 = "TDAT";
                n3 = ((String)object).equals(string11);
                if (n3 == 0) break;
                n14 = 13;
                break;
            }
            case 2569358: {
                String string12 = "TCON";
                n3 = ((String)object).equals(string12);
                if (n3 == 0) break;
                n14 = 12;
                break;
            }
            case 2569357: {
                String string13 = "TCOM";
                n3 = ((String)object).equals(string13);
                if (n3 == 0) break;
                n14 = 11;
                break;
            }
            case 2567331: {
                String string14 = "TALB";
                n3 = ((String)object).equals(string14);
                if (n3 == 0) break;
                n14 = 10;
                break;
            }
            case 83552: {
                String string15 = "TYE";
                n3 = ((String)object).equals(string15);
                if (n3 == 0) break;
                n14 = 9;
                break;
            }
            case 83536: {
                String string16 = "TXT";
                n3 = ((String)object).equals(string16);
                if (n3 == 0) break;
                n14 = 8;
                break;
            }
            case 83378: {
                String string17 = "TT2";
                n3 = ((String)object).equals(string17);
                if (n3 == 0) break;
                n14 = 7;
                break;
            }
            case 83341: {
                String string18 = "TRK";
                n3 = ((String)object).equals(string18);
                if (n3 == 0) break;
                n14 = 6;
                break;
            }
            case 83255: {
                String string19 = "TP3";
                n3 = ((String)object).equals(string19);
                if (n3 == 0) break;
                n14 = 5;
                break;
            }
            case 83254: {
                String string20 = "TP2";
                n3 = ((String)object).equals(string20);
                if (n3 == 0) break;
                n14 = 4;
                break;
            }
            case 83253: {
                String string21 = "TP1";
                n3 = ((String)object).equals(string21);
                if (n3 == 0) break;
                n14 = 3;
                break;
            }
            case 82897: {
                String string22 = "TDA";
                n3 = ((String)object).equals(string22);
                if (n3 == 0) break;
                n14 = 2;
                break;
            }
            case 82878: {
                String string23 = "TCM";
                n3 = ((String)object).equals(string23);
                if (n3 == 0) break;
                n14 = 1;
                break;
            }
            case 82815: {
                String string24 = "TAL";
                n3 = ((String)object).equals(string24);
                if (n3 == 0) break;
                n14 = 0;
            }
        }
        switch (n14) {
            default: {
                return;
            }
            case 15: {
                ArrayList arrayList = TextInformationFrame.a((String)immutableList.get(0));
                n3 = arrayList.size();
                if (n3 != n10) {
                    if (n3 != n8) {
                        if (n3 != n7) {
                            return;
                        }
                        object = (Integer)arrayList.get(n8);
                        e$a.k((Integer)object);
                    }
                    object = (Integer)arrayList.get(n10);
                    e$a.l((Integer)object);
                }
                Integer n16 = (Integer)arrayList.get(0);
                e$a.m(n16);
                return;
            }
            case 14: {
                ArrayList arrayList = TextInformationFrame.a((String)immutableList.get(0));
                n3 = arrayList.size();
                if (n3 != n10) {
                    if (n3 != n8) {
                        if (n3 != n7) {
                            return;
                        }
                        object = (Integer)arrayList.get(n8);
                        e$a.h((Integer)object);
                    }
                    object = (Integer)arrayList.get(n10);
                    e$a.i((Integer)object);
                }
                Integer n17 = (Integer)arrayList.get(0);
                e$a.j(n17);
                return;
            }
            case 12: {
                Integer n18 = Ints.tryParse((String)immutableList.get(0));
                if (n18 == null) {
                    CharSequence charSequence = (CharSequence)immutableList.get(0);
                    e$a.g(charSequence);
                    return;
                }
                n4 = n18;
                String string25 = Xc1.a(n4);
                if (string25 == null) return;
                e$a.g(string25);
                return;
            }
            case 9: 
            case 22: {
                Object e2 = immutableList.get(0);
                String string26 = (String)e2;
                n4 = Integer.parseInt(string26);
                Integer n19 = n4;
                e$a.j(n19);
                return;
            }
            case 8: 
            case 16: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.q(charSequence);
                return;
            }
            case 7: 
            case 17: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.n(charSequence);
                return;
            }
            case 6: 
            case 21: {
                void var12_50;
                String[] stringArray = gz3.R((String)immutableList.get(0));
                object = stringArray[0];
                n3 = Integer.parseInt((String)object);
                n7 = stringArray.length;
                if (n7 > n10) {
                    String string27 = stringArray[n10];
                    n4 = Integer.parseInt(string27);
                    Integer n20 = n4;
                } else {
                    n4 = 0;
                    Object var12_49 = null;
                }
                object = n3;
                e$a.p((Integer)object);
                e$a.o((Integer)var12_50);
                return;
            }
            case 5: 
            case 20: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.f(charSequence);
                return;
            }
            case 4: 
            case 19: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.b(charSequence);
                return;
            }
            case 3: 
            case 18: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.d(charSequence);
                return;
            }
            case 2: 
            case 13: {
                object = immutableList.get(0);
                String string28 = ((String)object).substring(n8, n4);
                n4 = Integer.parseInt(string28);
                object = ((String)object).substring(0, n8);
                n3 = Integer.parseInt((String)object);
                Integer n21 = n4;
                e$a.i(n21);
                Integer n22 = n3;
                e$a.h(n22);
                return;
            }
            case 1: 
            case 11: {
                CharSequence charSequence = (CharSequence)immutableList.get(0);
                e$a.e(charSequence);
                return;
            }
            case 0: 
            case 10: 
        }
        CharSequence charSequence = (CharSequence)immutableList.get(0);
        e$a.c(charSequence);
        return;
        catch (NumberFormatException | StringIndexOutOfBoundsException runtimeException) {
            return;
        }
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object[] objectArray = this.a;
        parcel.writeString((String)objectArray);
        objectArray = this.b;
        parcel.writeString((String)objectArray);
        objectArray = new String[]{};
        objectArray = (String[])this.c.toArray(objectArray);
        parcel.writeStringArray((String[])objectArray);
    }
}

