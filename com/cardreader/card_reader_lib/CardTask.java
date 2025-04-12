/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.nfc.NfcAdapter
 *  android.nfc.Tag
 *  android.nfc.tech.IsoDep
 *  android.nfc.tech.NfcA
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  org.json.JSONObject
 */
package com.cardreader.card_reader_lib;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public class CardTask {
    public static yz0 c;
    public static final IntentFilter[] d;
    public static final String[][] e;
    public NfcAdapter a;
    public PendingIntent b;

    static {
        String[][] stringArrayArray = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        String[] stringArray = new IntentFilter("android.nfc.action.TAG_DISCOVERED");
        Object object = new IntentFilter[2];
        object[0] = stringArrayArray;
        int n3 = 1;
        object[n3] = stringArray;
        d = object;
        stringArray = NfcA.class.getName();
        object = IsoDep.class.getName();
        stringArray = new String[]{stringArray, object};
        stringArrayArray = new String[n3][];
        stringArrayArray[0] = stringArray;
        e = stringArrayArray;
    }

    public CardTask() {
        yz0 yz02;
        c = yz02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(byte[] object) {
        int n3 = 2;
        Object object2 = new jc1_0[n3];
        Object object3 = zz0_1.d;
        object2[0] = object3;
        object3 = zz0_1.j;
        int n4 = 1;
        object2[n4] = object3;
        object = Xn3.c((byte[])object, (jc1_0[])object2);
        Em3.a((byte[])object);
        if (object != null) {
            object2 = "";
            try {
                int n7 = ((byte[])object).length;
                int n8 = 0;
                while (true) {
                    if (n8 >= n7) {
                        object = "D";
                        object = ((String)object2).split((String)object);
                        object2 = c;
                        object3 = object[0];
                        ((yz0)object2).a = object3;
                        object3 = object[n4];
                        n8 = 4;
                        ((yz0)object2).b = object3 = ((String)object3).substring(n3, n8);
                        object2 = c;
                        object = object[n4];
                        ((yz0)object2).c = object = ((String)object).substring(0, n3);
                        return n4 != 0;
                    }
                    byte by2 = object[n8];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object2);
                    object2 = "%02X";
                    Byte by4 = by2;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = by4;
                    object2 = String.format((String)object2, objectArray);
                    stringBuilder.append((String)object2);
                    object2 = stringBuilder.toString();
                    n8 += n4;
                }
            }
            catch (Exception exception) {}
            ((Object)exception).toString();
        }
        return false;
    }

    public List extractAfl(byte[] object) {
        int n3;
        int n4;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        while ((n4 = byteArrayInputStream.available()) >= (n3 = 4)) {
            object = new t5;
            object();
            object.a = n3 = byteArrayInputStream.read() >> 3;
            object.b = n3 = byteArrayInputStream.read();
            object.c = n3 = byteArrayInputStream.read();
            byteArrayInputStream.read();
            arrayList.add((byte[])object);
        }
        return arrayList;
    }

    public boolean extractPublicData(IsoDep isoDep, byte[] byArray) {
        Object object;
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3 = isoDep;
        Object object4 = byArray;
        int n8 = 0;
        int n10 = 1;
        Object object5 = AZ.SELECT;
        int n14 = object5.getCla();
        int n15 = object5.getIns();
        int n16 = object5.getP1();
        int n17 = object5.getP2();
        if (byArray == null) {
            n7 = 0;
            object2 = null;
        } else {
            n7 = byArray.length;
        }
        int n18 = 5;
        int n19 = 4;
        n4 = object4 != null && (n4 = ((byte[])object4).length) != 0 ? ((byte[])object4).length + n18 : 4;
        Object object6 = new byte[n4 += n10];
        object6[0] = n14 = (int)((byte)n14);
        object6[n10] = n14 = (int)((byte)n15);
        n14 = (byte)n16;
        n15 = 2;
        object6[n15] = n14;
        n17 = (byte)n17;
        n14 = 3;
        object6[n14] = n17;
        if (object4 != null && (n17 = ((byte[])object4).length) != 0) {
            object6[n19] = n17 = (int)((byte)n7);
            n17 = ((byte[])object4).length;
            System.arraycopy(object4, 0, object6, n18, n17);
            n3 = ((byte[])object4).length + n18;
        } else {
            n3 = 4;
        }
        n17 = object6[n3];
        n16 = (byte)0;
        object6[n3] = n17 = (int)((byte)(n17 + n16));
        Em3.a(object6);
        object4 = object3.transceive(object6);
        Em3.a((byte[])object4);
        object5 = "9000";
        object2 = Em3.d((String)object5);
        n7 = (int)(R90.b((byte[])object4, object2) ? 1 : 0);
        if (n7 != 0) {
            int n20;
            Object[] objectArray;
            Object object7;
            int n21;
            int n22;
            Em3.a((byte[])object4);
            object2 = new jc1_0[n10];
            object6 = zz0_1.c;
            object2[0] = (byte)object6;
            object2 = Xn3.c((byte[])object4, (jc1_0[])object2);
            n4 = ((byte[])object2).length;
            object = "";
            Object object8 = null;
            for (n22 = 0; n22 < n4; n22 += n10) {
                n21 = object2[n22];
                object = Ex0.a((String)object);
                object7 = (byte)n21;
                objectArray = new Object[n10];
                objectArray[0] = object7;
                object7 = String.format("%02X", objectArray);
                ((StringBuilder)object).append((String)object7);
                object = ((StringBuilder)object).toString();
            }
            c.getClass();
            object2 = new jc1_0[n10];
            object6 = zz0_1.h;
            object2[0] = (byte)object6;
            object4 = Xn3.c((byte[])object4, (jc1_0[])object2);
            if (object4 != null) {
                Em3.a((byte[])object4);
            }
            object2 = new ArrayList;
            object2();
            if (object4 != null) {
                object6 = new ByteArrayInputStream;
                object6((byte[])object4);
                while ((n3 = object6.available()) > 0) {
                    n3 = object6.available();
                    if (n3 >= n15) {
                        object4 = Xn3.e((ByteArrayInputStream)object6);
                        object = zz0_1.a;
                        object4.getClass();
                        object8 = new ZE((byte[])object4);
                        object = (jc1_0)((LinkedHashMap)object).get(object8);
                        if (object == null) {
                            object8 = yi3.BINARY;
                            object7 = "[UNKNOWN TAG]";
                            object = new wi3_1((byte[])object4, (yi3)((Object)object8), (String)object7);
                        }
                        n3 = Xn3.f((ByteArrayInputStream)object6);
                        object8 = new Object();
                        ((vi3_1)object8).a = object;
                        ((vi3_1)object8).b = n3;
                        object2.add(object8);
                        continue;
                    }
                    object3 = new StringBuilder("Data length < 2 : ");
                    n8 = object6.available();
                    ((StringBuilder)object3).append(n8);
                    object3 = ((StringBuilder)object3).toString();
                    object4 = new RuntimeException((String)object3);
                    throw object4;
                }
            }
            object6 = new ByteArrayOutputStream;
            object6();
            object4 = zz0_1.f;
            object4 = ((wi3_1)object4).a;
            object6.write((byte[])object4);
            object4 = object2.iterator();
            int n24 = 0;
            object = null;
            while (true) {
                n22 = (int)(object4.hasNext() ? 1 : 0);
                if (n22 == 0) break;
                object8 = object4.next();
                object8 = (vi3_1)object8;
                n22 = ((vi3_1)object8).b;
                n24 += n22;
                continue;
                break;
            }
            try {
                object6.write(n24);
                object4 = object2.iterator();
            }
            catch (IOException iOException) {
                ((Object)iOException).toString();
            }
            while (true) {
                n7 = (int)(object4.hasNext() ? 1 : 0);
                if (n7 == 0) break;
                object2 = object4.next();
                object2 = (vi3_1)object2;
                object2.toString();
                object2 = Az0.a((vi3_1)object2);
                object6.write((byte[])object2);
                continue;
                break;
            }
            object4 = (Object)AZ.GPO;
            object2 = object6.toByteArray();
            n4 = ((AZ)((Object)object4)).getCla();
            n24 = ((AZ)((Object)object4)).getIns();
            n22 = ((AZ)((Object)object4)).getP1();
            n3 = ((AZ)((Object)object4)).getP2();
            if (object2 == null) {
                n21 = 0;
                object7 = null;
            } else {
                n21 = ((Object)object2).length;
            }
            n20 = object2 != null && (n20 = ((Object)object2).length) != 0 ? ((Object)object2).length + n18 : 4;
            objectArray = new byte[n20 += n10];
            n4 = (byte)n4;
            objectArray[0] = n4;
            n4 = (byte)n24;
            objectArray[n10] = n4;
            n4 = (byte)n22;
            objectArray[n15] = n4;
            n3 = (byte)n3;
            objectArray[n14] = n3;
            if (object2 != null && (n3 = ((byte[])object2).length) != 0) {
                n3 = (byte)n21;
                objectArray[n19] = n3;
                n3 = ((byte[])object2).length;
                System.arraycopy(object2, 0, objectArray, n18, n3);
                n3 = ((byte[])object2).length + n18;
            } else {
                n3 = 4;
            }
            n7 = (byte)(objectArray[n3] + n16);
            objectArray[n3] = n7;
            object4 = object3.transceive((byte[])objectArray);
            if (object4 != null) {
                Em3.a((byte[])object4);
            }
            if ((n7 = (int)(R90.b((byte[])object4, object2 = Em3.d((String)object5)) ? 1 : 0)) != 0) {
                Em3.a((byte[])object4);
                object2 = new jc1_0[n10];
                object6 = zz0_1.e;
                object2[0] = (byte)object6;
                object2 = Xn3.c((byte[])object4, (jc1_0[])object2);
                if (object2 != null) {
                    Em3.a(object2);
                    n3 = ((byte[])object2).length;
                    n4 = ((byte[])object2).length;
                    if (n3 > n4) {
                        n3 = ((byte[])object2).length;
                    }
                    if ((n3 -= n15) <= 0) {
                        object4 = new byte[0];
                        object2 = object4;
                    } else {
                        object6 = new byte[n3];
                        System.arraycopy(object2, n15, object6, 0, n3);
                        object2 = object6;
                    }
                    n4 = 0;
                    object6 = null;
                } else {
                    n4 = (int)(CardTask.a((byte[])object4) ? 1 : 0);
                    if (n4 == 0) {
                        object2 = new jc1_0[n10];
                        object = zz0_1.g;
                        object2[0] = (byte)object;
                        object2 = Xn3.c((byte[])object4, (jc1_0[])object2);
                    }
                }
                object = this;
                if (object2 != null) {
                    object4 = this.extractAfl((byte[])object2).iterator();
                    block18: while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                        object2 = (t5)object4.next();
                        for (n22 = object2.b; n22 <= (n21 = object2.c); n22 += n10) {
                            byte[] byArray2;
                            byte[] byArray3;
                            object7 = AZ.READ_RECORD;
                            n20 = object2.a << n14 | n19;
                            n19 = ((AZ)((Object)object7)).getCla();
                            n14 = ((AZ)((Object)object7)).getIns();
                            byte[] byArray4 = new byte[n18];
                            byArray4[0] = n19 = (int)((byte)n19);
                            byArray4[n10] = n14 = (int)((byte)n14);
                            byArray4[2] = n14 = (int)((byte)n22);
                            byArray4[3] = n19 = (int)((byte)n20);
                            n19 = 4;
                            byArray4[n19] = n20 = (int)((byte)(byArray4[n19] + n16));
                            n19 = (int)(R90.b(byArray4 = object3.transceive(byArray4), byArray3 = Em3.d("6C")) ? 1 : 0);
                            if (n19 != 0) {
                                n19 = object2.a << 3 | 4;
                                n20 = byArray4.length - n10;
                                n15 = byArray4[n20];
                                n20 = ((AZ)((Object)object7)).getCla();
                                n21 = ((AZ)((Object)object7)).getIns();
                                byArray2 = new byte[n18];
                                byArray2[0] = n20 = (int)((byte)n20);
                                byArray2[1] = n21 = (int)((byte)n21);
                                n21 = 2;
                                byArray2[n21] = n14;
                                n14 = (byte)n19;
                                n19 = 3;
                                byArray2[n19] = n14;
                                n14 = 4;
                                n20 = byArray2[n14];
                                n15 = (byte)n15;
                                n20 += n15;
                                byArray2[n14] = n15 = (int)((byte)n20);
                                byArray4 = object3.transceive(byArray2);
                            } else {
                                n14 = 4;
                                n19 = 3;
                                n21 = 2;
                            }
                            byArray2 = Em3.d((String)object5);
                            n10 = (int)(R90.b(byArray4, byArray2) ? 1 : 0);
                            if (n10 != 0 && (n4 = (int)(CardTask.a(byArray4) ? 1 : 0)) != 0) break block18;
                            n10 = 1;
                            n14 = 3;
                            n15 = 2;
                            n19 = 4;
                        }
                        n14 = 3;
                        n19 = 4;
                    }
                }
                return n4 != 0;
            }
        }
        object = this;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getCardDetails(Intent object) {
        try {
            zz0_1.a();
            String string2 = object.getAction();
            Object object2 = "android.nfc.action.TECH_DISCOVERED";
            boolean bl2 = string2.equals(object2);
            if (!bl2) return null;
            string2 = this.a;
            if (string2 == null) return null;
            bl2 = string2.isEnabled();
            if (!bl2) return null;
            string2 = "android.nfc.extra.TAG";
            Parcelable parcelable = object.getParcelableExtra(string2);
            Tag tag = (Tag)parcelable;
            if (tag != null) {
                IsoDep isoDep = IsoDep.get((Tag)tag);
                this.readWithPSE(isoDep);
            }
            yz0 yz02 = c;
            string2 = yz02.a;
            object2 = yz02.b;
            String string3 = yz02.c;
            if (string2 == null) return null;
            if (object2 == null) return null;
            if (string3 == null) return null;
            JSONObject jSONObject = new JSONObject();
            string2 = "cardNumber";
            object2 = c;
            object2 = ((yz0)object2).a;
            jSONObject.put(string2, object2);
            string2 = "expiryMonth";
            object2 = c;
            object2 = ((yz0)object2).b;
            jSONObject.put(string2, object2);
            string2 = "expiryYear";
            object2 = c;
            object2 = ((yz0)object2).c;
            jSONObject.put(string2, object2);
            return jSONObject.toString();
        }
        catch (Exception exception) {}
        return null;
    }

    public boolean isNFCEnabled(Context context) {
        context = NfcAdapter.getDefaultAdapter((Context)context);
        this.a = context;
        if (context != null) {
            return context.isEnabled();
        }
        return false;
    }

    public boolean isNFCSupported(Context context) {
        context = NfcAdapter.getDefaultAdapter((Context)context);
        this.a = context;
        return context != null;
    }

    public void onPauseClone(Activity activity) {
        NfcAdapter nfcAdapter = this.a;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(activity);
        }
    }

    public void onResumeClone(Activity activity) {
        Intent intent;
        Context context;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        IntentFilter[] intentFilterArray = null;
        int n7 = 0x20000000;
        if (n3 >= n4) {
            context = activity.getApplicationContext();
            Context context2 = activity.getApplicationContext();
            Class<?> clazz = activity.getClass();
            intent = new Intent(context2, clazz);
            intent = intent.addFlags(n7);
            n7 = 0x2000000;
            context = PendingIntent.getActivity((Context)context, (int)0, (Intent)intent, (int)n7);
            this.b = context;
        } else {
            context = activity.getApplicationContext();
            Context context3 = activity.getApplicationContext();
            Class<?> clazz = activity.getClass();
            intent = new Intent(context3, clazz);
            intent = intent.addFlags(n7);
            n7 = 0x4000000;
            context = PendingIntent.getActivity((Context)context, (int)0, (Intent)intent, (int)n7);
            this.b = context;
        }
        context = this.a;
        intent = this.b;
        intentFilterArray = d;
        String[][] stringArray = e;
        context.enableForegroundDispatch(activity, (PendingIntent)intent, intentFilterArray, stringArray);
    }

    public boolean readWithPSE(IsoDep isoDep) {
        int n3;
        int n4;
        int n7 = 2;
        int n8 = 1;
        Object object = "2PAY.SYS.DDF01".getBytes();
        isoDep.connect();
        Object object2 = AZ.SELECT;
        int n10 = ((AZ)((Object)object2)).getCla();
        int n14 = ((AZ)((Object)object2)).getIns();
        int n15 = ((AZ)((Object)object2)).getP1();
        int n16 = ((AZ)((Object)object2)).getP2();
        int n17 = object == null ? 0 : ((byte[])object).length;
        int n18 = 5;
        int n19 = 4;
        n4 = object != null && (n4 = ((byte[])object).length) != 0 ? ((byte[])object).length + n18 : 4;
        byte[] byArray = new byte[n4 += n8];
        byArray[0] = n10 = (int)((byte)n10);
        byArray[n8] = n10 = (int)((byte)n14);
        byArray[n7] = n10 = (int)((byte)n15);
        n16 = (byte)n16;
        n10 = 3;
        byArray[n10] = n16;
        if (object != null && (n16 = ((byte[])object).length) != 0) {
            byArray[n19] = n16 = (int)((byte)n17);
            n16 = ((byte[])object).length;
            System.arraycopy(object, 0, byArray, n18, n16);
            n3 = ((byte[])object).length;
            n19 = n18 + n3;
        }
        n3 = byArray[n19];
        n16 = (byte)0;
        byArray[n19] = n3 = (byte)(n3 + n16);
        object = isoDep.transceive(byArray);
        Em3.a(object);
        object2 = Em3.d("9000");
        n16 = (int)(R90.b(object, (byte[])object2) ? 1 : 0);
        if (n16 != 0) {
            object2 = new ArrayList();
            Object object3 = new jc1_0[n7];
            Object object4 = zz0_1.b;
            object3[0] = object4;
            object4 = zz0_1.k;
            object3[n8] = object4;
            object3 = Xn3.d(object, (jc1_0[])object3).iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object = (kh3_0)object3.next();
                object4 = object.a;
                Object object5 = zz0_1.k;
                object = object.b;
                if (object4 == object5 && (n10 = ((ArrayList)object2).size()) != 0) {
                    object4 = (byte[])pp_0.a(n8, (ArrayList)object2);
                    if (object4 == null) {
                        if (object == null) {
                            n3 = 0;
                            object = null;
                        } else {
                            object = (byte[])object.clone();
                        }
                    } else if (object == null) {
                        object = (byte[])object4.clone();
                    } else {
                        n14 = ((Object)object4).length;
                        n15 = ((byte[])object).length;
                        object5 = new byte[n14 += n15];
                        n15 = ((Object)object4).length;
                        System.arraycopy(object4, 0, object5, 0, n15);
                        n10 = ((Object)object4).length;
                        n15 = ((byte[])object).length;
                        System.arraycopy(object, 0, object5, n10, n15);
                        object = object5;
                    }
                    ((ArrayList)object2).add(object);
                    continue;
                }
                ((ArrayList)object2).add(object);
            }
            object3 = ((ArrayList)object2).iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object = (byte[])object3.next();
                Em3.a(object);
                try {
                    n3 = (int)(this.extractPublicData(isoDep, (byte[])object) ? 1 : 0);
                    if (n3 == 0) continue;
                }
                catch (IOException iOException) {
                    object3 = new RuntimeException(iOException);
                    throw object3;
                }
                isoDep.close();
                return n8 != 0;
            }
        }
        isoDep.close();
        return false;
    }
}

