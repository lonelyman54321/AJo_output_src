/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.color.ColorResourcesTableCreator$1;
import com.google.android.material.color.ColorResourcesTableCreator$ColorResource;
import com.google.android.material.color.ColorResourcesTableCreator$PackageInfo;
import com.google.android.material.color.ColorResourcesTableCreator$ResTable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final ColorResourcesTableCreator$PackageInfo ANDROID_PACKAGE_INFO;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final Comparator COLOR_RESOURCE_COMPARATOR;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;

    static {
        Object object = new ColorResourcesTableCreator$PackageInfo(1, "android");
        ANDROID_PACKAGE_INFO = object;
        COLOR_RESOURCE_COMPARATOR = object = new ColorResourcesTableCreator$1();
    }

    private ColorResourcesTableCreator() {
    }

    public static /* synthetic */ byte[] access$1200(char c2) {
        return ColorResourcesTableCreator.charToByteArray(c2);
    }

    public static /* synthetic */ byte access$1300() {
        return typeIdColor;
    }

    public static /* synthetic */ Comparator access$400() {
        return COLOR_RESOURCE_COMPARATOR;
    }

    public static /* synthetic */ byte[] access$500(int n3) {
        return ColorResourcesTableCreator.intToByteArray(n3);
    }

    public static /* synthetic */ byte[] access$600(short s7) {
        return ColorResourcesTableCreator.shortToByteArray(s7);
    }

    public static /* synthetic */ byte[] access$800(String string2) {
        return ColorResourcesTableCreator.stringToByteArrayUtf8(string2);
    }

    public static /* synthetic */ byte[] access$900(String string2) {
        return ColorResourcesTableCreator.stringToByteArray(string2);
    }

    private static byte[] charToByteArray(char c2) {
        byte by2 = (byte)(c2 & 0xFF);
        c2 = (char)(c2 >> 8 & 0xFF);
        byte[] byArray = new byte[]{by2, c2};
        return byArray;
    }

    public static byte[] create(Context object, Map object2) {
        block6: {
            byte by2;
            boolean bl2;
            Set set = object2.entrySet();
            byte by4 = set.isEmpty();
            if (by4 != 0) break block6;
            HashMap<Object, Resources> hashMap = object.getPackageName();
            int n3 = 127;
            set = new ColorResourcesTableCreator$PackageInfo(n3, (String)((Object)hashMap));
            hashMap = new HashMap<Object, Resources>();
            object2 = object2.entrySet().iterator();
            int n4 = 0;
            Object object3 = null;
            while (bl2 = object2.hasNext()) {
                ColorResourcesTableCreator$ColorResource colorResourcesTableCreator$ColorResource;
                block7: {
                    block10: {
                        Object object4;
                        int n7;
                        block9: {
                            block8: {
                                object3 = (Map.Entry)object2.next();
                                n7 = (Integer)object3.getKey();
                                Object object5 = object.getResources();
                                int n8 = (Integer)object3.getKey();
                                object5 = object5.getResourceName(n8);
                                Integer n10 = (Integer)object3.getValue();
                                n8 = n10;
                                colorResourcesTableCreator$ColorResource = new ColorResourcesTableCreator$ColorResource(n7, (String)object5, n8);
                                object4 = object.getResources();
                                n4 = (Integer)object3.getKey();
                                object3 = object4.getResourceTypeName(n4);
                                if ((n4 = (int)(((String)object3).equals(object4 = RESOURCE_TYPE_NAME_COLOR) ? 1 : 0)) == 0) break block7;
                                n4 = ColorResourcesTableCreator$ColorResource.access$300(colorResourcesTableCreator$ColorResource);
                                if (n4 != (n7 = 1)) break block8;
                                object3 = ANDROID_PACKAGE_INFO;
                                break block9;
                            }
                            n4 = ColorResourcesTableCreator$ColorResource.access$300(colorResourcesTableCreator$ColorResource);
                            if (n4 != n3) break block10;
                            object3 = set;
                        }
                        n7 = (int)(hashMap.containsKey(object3) ? 1 : 0);
                        if (n7 == 0) {
                            object4 = new ArrayList();
                            hashMap.put(object3, (Resources)object4);
                        }
                        ((List)hashMap.get(object3)).add(colorResourcesTableCreator$ColorResource);
                        object3 = colorResourcesTableCreator$ColorResource;
                        continue;
                    }
                    object2 = new StringBuilder("Not supported with unknown package id: ");
                    by4 = ColorResourcesTableCreator$ColorResource.access$300(colorResourcesTableCreator$ColorResource);
                    ((StringBuilder)object2).append(by4);
                    object2 = ((StringBuilder)object2).toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
                object2 = new StringBuilder("Non color resource found: name=");
                set = ColorResourcesTableCreator$ColorResource.access$100(colorResourcesTableCreator$ColorResource);
                ((StringBuilder)object2).append((String)((Object)set));
                ((StringBuilder)object2).append(", typeId=");
                set = Integer.toHexString(ColorResourcesTableCreator$ColorResource.access$200(colorResourcesTableCreator$ColorResource) & 0xFF);
                ((StringBuilder)object2).append((String)((Object)set));
                object2 = ((StringBuilder)object2).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            typeIdColor = by2 = ColorResourcesTableCreator$ColorResource.access$200(object3);
            if (by2 != 0) {
                object = new ByteArrayOutputStream();
                object2 = new ColorResourcesTableCreator$ResTable(hashMap);
                ((ColorResourcesTableCreator$ResTable)object2).writeTo((ByteArrayOutputStream)object);
                return ((ByteArrayOutputStream)object).toByteArray();
            }
            object = new IllegalArgumentException("No color resources found for harmonization.");
            throw object;
        }
        object = new IllegalArgumentException("No color resources provided for harmonization.");
        throw object;
    }

    private static byte[] intToByteArray(int n3) {
        byte by2 = (byte)(n3 & 0xFF);
        byte by4 = (byte)(n3 >> 8 & 0xFF);
        byte by5 = (byte)(n3 >> 16 & 0xFF);
        n3 = (byte)(n3 >> 24 & 0xFF);
        byte[] byArray = new byte[]{by2, by4, by5, n3};
        return byArray;
    }

    private static byte[] shortToByteArray(short s7) {
        byte by2 = (byte)(s7 & 0xFF);
        s7 = (byte)(s7 >> 8 & 0xFF);
        byte[] byArray = new byte[]{by2, s7};
        return byArray;
    }

    private static byte[] stringToByteArray(String object) {
        int n3;
        int n4;
        byte by2;
        object = ((String)object).toCharArray();
        int n7 = ((Object)object).length * 2;
        int n8 = n7 + 4;
        byte[] byArray = new byte[n8];
        byte[] byArray2 = ColorResourcesTableCreator.shortToByteArray((short)((Object)object).length);
        byArray[0] = by2 = byArray2[0];
        by2 = 1;
        byArray[by2] = n4 = byArray2[by2];
        byArray2 = null;
        for (n4 = 0; n4 < (n3 = ((Object)object).length); ++n4) {
            byte by4;
            byte[] byArray3 = ColorResourcesTableCreator.charToByteArray((char)object[n4]);
            int n10 = n4 * 2;
            int n14 = n10 + 2;
            byArray[n14] = by4 = byArray3[0];
            byArray[n10 += 3] = n3 = byArray3[by2];
        }
        int n15 = n7 + 2;
        byArray[n15] = 0;
        byArray[n7 += 3] = 0;
        return byArray;
    }

    private static byte[] stringToByteArrayUtf8(String object) {
        Charset charset = Charset.forName("UTF-8");
        object = ((String)object).getBytes(charset);
        byte by2 = (byte)((Object)object).length;
        int n3 = ((Object)object).length;
        byte[] byArray = new byte[n3 + 3];
        int n4 = 2;
        System.arraycopy(object, 0, byArray, n4, by2);
        byArray[1] = by2;
        byArray[0] = by2;
        byArray[n3 += n4] = 0;
        return byArray;
    }
}

