/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.Freezable;
import java.util.ArrayList;
import java.util.Iterator;

public final class DataBufferUtils {
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static ArrayList freezeAndClose(DataBuffer dataBuffer) {
        Throwable throwable2;
        block9: {
            ArrayList<Object> arrayList;
            block8: {
                Iterator iterator;
                int n3 = dataBuffer.getCount();
                arrayList = new ArrayList<Object>(n3);
                try {
                    iterator = dataBuffer.iterator();
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                while (true) {
                    boolean bl2 = iterator.hasNext();
                    if (!bl2) break block8;
                    break;
                }
                {
                    Object object = iterator.next();
                    object = (Freezable)object;
                    object = object.freeze();
                    arrayList.add(object);
                    continue;
                }
            }
            dataBuffer.close();
            return arrayList;
        }
        dataBuffer.close();
        throw throwable2;
    }

    public static boolean hasData(DataBuffer dataBuffer) {
        int n3;
        return dataBuffer != null && (n3 = dataBuffer.getCount()) > 0;
    }

    public static boolean hasNextPage(DataBuffer object) {
        String string2;
        return (object = object.getMetadata()) != null && (object = object.getString(string2 = KEY_NEXT_PAGE_TOKEN)) != null;
    }

    public static boolean hasPrevPage(DataBuffer object) {
        String string2;
        return (object = object.getMetadata()) != null && (object = object.getString(string2 = KEY_PREV_PAGE_TOKEN)) != null;
    }
}

