/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.work.b$a;
import com.google.android.play.core.assetpacks.bw;
import com.google.android.play.core.assetpacks.by;
import com.google.android.play.core.assetpacks.bz;
import com.google.android.play.core.assetpacks.model.b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

final class cb {
    public static Bundle a(androidx.work.b b2) {
        bz bz2 = new bz("notification_bundle:", b2, null);
        cb.d(bz2);
        return bz.h(bz2);
    }

    public static Bundle b(androidx.work.b b2) {
        bz bz2 = new bz("session_bundle:", b2, null);
        cb.e(bz2);
        return bz.h(bz2);
    }

    public static androidx.work.b c(Bundle object, Bundle bundle) {
        b$a b$a = new b$a();
        String string2 = "BUNDLE_DATA_CONVERTER_VERSION";
        Intrinsics.checkNotNullParameter(string2, "key");
        b$a.a.put(string2, "1.0");
        bw bw4 = new bw("session_bundle:", (Bundle)object, b$a, null);
        cb.e(bw4);
        object = new bw("notification_bundle:", bundle, b$a, null);
        cb.d((by)object);
        return b$a.a();
    }

    private static void d(by by2) {
        by2.g("notification_channel_name");
        by2.g("notification_title");
        by2.g("notification_subtext");
        by2.c("notification_color");
        by2.f("notification_timeout", 600000L);
        by2.b("notification_intent_reconstruct_from_data");
        by2.g("notification_intent_component_class_name");
        by2.g("notification_intent_component_package_name");
        by2.g("notification_intent_package");
        by2.g("notification_intent_action");
        by2.g("notification_intent_data");
        by2.c("notification_intent_flags");
        by2.g("notification_intent_extra_error_dialog_document_id");
    }

    private static void e(by by2) {
        boolean bl2;
        by2.c("session_id");
        by2.c("app_version_code");
        Iterator iterator = by2.a("pack_names").iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2 = (String)iterator.next();
            Object object = b.a("pack_version", string2);
            by2.e((String)object);
            object = b.a("pack_version_tag", string2);
            by2.g((String)object);
            object = b.a("status", string2);
            by2.c((String)object);
            object = b.a("total_bytes_to_download", string2);
            by2.e((String)object);
            object = b.a("slice_ids", string2);
            object = by2.a((String)object).iterator();
            while (bl3 = object.hasNext()) {
                String string3 = (String)object.next();
                String string4 = b.b("chunk_intents", string2, string3);
                by2.d(string4);
                string4 = b.b("uncompressed_hash_sha256", string2, string3);
                by2.g(string4);
                string4 = b.b("uncompressed_size", string2, string3);
                by2.e(string4);
                string4 = b.b("patch_format", string2, string3);
                by2.c(string4);
                string4 = "compression_format";
                string3 = b.b(string4, string2, string3);
                by2.c(string3);
            }
        }
    }
}

