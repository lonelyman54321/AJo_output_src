/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.Intent
 *  android.net.Uri
 */
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

public final class E13 {
    public static void a(Intent intent, ArrayList arrayList) {
        CharSequence charSequence = intent.getCharSequenceExtra("android.intent.extra.TEXT");
        String string2 = intent.getStringExtra("android.intent.extra.HTML_TEXT");
        String[] stringArray = intent.getType();
        stringArray = new String[]{stringArray};
        Uri uri = (Uri)arrayList.get(0);
        ClipData.Item item = new ClipData.Item(charSequence, string2, null, uri);
        ClipData clipData = new ClipData(null, stringArray, item);
        int n3 = arrayList.size();
        int n4 = 1;
        for (int i3 = 1; i3 < n3; ++i3) {
            item = (Uri)arrayList.get(i3);
            uri = new ClipData.Item((Uri)item);
            clipData.addItem((ClipData.Item)uri);
        }
        intent.setClipData(clipData);
        intent.addFlags(n4);
    }
}

