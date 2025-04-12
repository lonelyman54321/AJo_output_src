/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from kq3
 */
public final class kq3_0
implements C13 {
    public final HttpTransaction a;
    public final boolean b;

    public kq3_0(HttpTransaction httpTransaction, boolean bl2) {
        Intrinsics.checkNotNullParameter(httpTransaction, "transaction");
        this.a = httpTransaction;
        this.b = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final ce_2 a(Context object) {
        void var1_5;
        boolean bl2;
        int n3;
        jv0_0 jv0_02;
        String string2;
        Object object2;
        Object object3;
        int n4;
        Object object4;
        String string3;
        int n7;
        HttpTransaction httpTransaction;
        Object object5;
        int n8;
        CharSequence charSequence;
        ce_2 ce_22;
        block19: {
            block18: {
                Intrinsics.checkNotNullParameter(object, "context");
                ce_22 = new ce_2();
                charSequence = new StringBuilder();
                n8 = R$string.chucker_url;
                object5 = object.getString(n8);
                ((StringBuilder)charSequence).append((String)object5);
                object5 = ": ";
                ((StringBuilder)charSequence).append((String)object5);
                httpTransaction = this.a;
                n7 = this.b;
                string3 = httpTransaction.getFormattedUrl(n7 != 0);
                ((StringBuilder)charSequence).append(string3);
                n7 = 10;
                ((StringBuilder)charSequence).append((char)n7);
                charSequence = ((StringBuilder)charSequence).toString();
                ce_22.I0((String)charSequence);
                charSequence = new StringBuilder();
                int n10 = R$string.chucker_method;
                object4 = object.getString(n10);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object5);
                object4 = httpTransaction.getMethod();
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append((char)n7);
                charSequence = ((StringBuilder)charSequence).toString();
                ce_22.I0((String)charSequence);
                charSequence = new StringBuilder();
                n10 = R$string.chucker_protocol;
                object4 = object.getString(n10);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object5);
                object4 = httpTransaction.getProtocol();
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append((char)n7);
                charSequence = ((StringBuilder)charSequence).toString();
                ce_22.I0((String)charSequence);
                charSequence = new StringBuilder();
                n10 = R$string.chucker_status;
                object4 = object.getString(n10);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object5);
                object4 = httpTransaction.getStatus();
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append((char)n7);
                charSequence = ((StringBuilder)charSequence).toString();
                ce_22.I0((String)charSequence);
                charSequence = new StringBuilder();
                n10 = R$string.chucker_response;
                object4 = object.getString(n10);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object5);
                object4 = httpTransaction.getResponseSummaryText();
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append((char)n7);
                charSequence = ((StringBuilder)charSequence).toString();
                ce_22.I0((String)charSequence);
                n4 = httpTransaction.isSsl();
                n4 = n4 != 0 ? R$string.chucker_yes : R$string.chucker_no;
                object4 = new StringBuilder();
                int n14 = R$string.chucker_ssl;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                charSequence = object.getString(n4);
                ((StringBuilder)object4).append((String)charSequence);
                ((StringBuilder)object4).append((char)n7);
                charSequence = ((StringBuilder)object4).toString();
                ce_22.I0((String)charSequence);
                charSequence = "\n";
                ce_22.I0((String)charSequence);
                object4 = new StringBuilder();
                n14 = R$string.chucker_request_time;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object3 = httpTransaction.getRequestDateString();
                ((StringBuilder)object4).append(object3);
                ((StringBuilder)object4).append((char)n7);
                object4 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object4);
                object4 = new StringBuilder();
                n14 = R$string.chucker_response_time;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object3 = httpTransaction.getResponseDateString();
                ((StringBuilder)object4).append(object3);
                ((StringBuilder)object4).append((char)n7);
                object4 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object4);
                object4 = new StringBuilder();
                n14 = R$string.chucker_duration;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object3 = httpTransaction.getDurationString();
                ((StringBuilder)object4).append(object3);
                ((StringBuilder)object4).append((char)n7);
                object4 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object4);
                ce_22.I0((String)charSequence);
                object4 = new StringBuilder();
                n14 = R$string.chucker_request_size;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object3 = httpTransaction.getRequestSizeString();
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((char)n7);
                object4 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object4);
                object4 = new StringBuilder();
                n14 = R$string.chucker_response_size;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object3 = httpTransaction.getResponseSizeString();
                ((StringBuilder)object4).append(object3);
                ((StringBuilder)object4).append((char)n7);
                object4 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object4);
                object4 = new StringBuilder();
                n14 = R$string.chucker_total_size;
                object3 = object.getString(n14);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object5);
                object5 = httpTransaction.getTotalSizeString();
                ((StringBuilder)object4).append((String)object5);
                ((StringBuilder)object4).append((char)n7);
                object5 = ((StringBuilder)object4).toString();
                ce_22.I0((String)object5);
                ce_22.I0((String)charSequence);
                string3 = "---------- ";
                object5 = new StringBuilder(string3);
                n10 = R$string.chucker_request;
                object4 = object.getString(n10);
                ((StringBuilder)object5).append((String)object4);
                object4 = " ----------\n\n";
                ((StringBuilder)object5).append((String)object4);
                object5 = ((StringBuilder)object5).toString();
                ce_22.I0((String)object5);
                object5 = httpTransaction.getParsedRequestHeaders();
                object3 = "";
                if (object5 == null) break block18;
                object2 = object5;
                object2 = (Iterable)object5;
                string2 = "";
                jv0_02 = new jv0_0(false);
                n3 = 30;
                if ((object5 = CollectionsKt.R((Iterable)object2, string2, null, null, jv0_02, n3)) != null) break block19;
            }
            object5 = object3;
        }
        if (bl2 = kotlin.text.b.k((CharSequence)object5) ^ true) {
            ce_22.I0((String)object5);
            ce_22.I0((String)charSequence);
        }
        if ((n8 = (int)(httpTransaction.isRequestBodyPlainText() ? 1 : 0)) != 0) {
            object5 = httpTransaction.getRequestBody();
            if (object5 != null && (n8 = (int)(kotlin.text.b.k((CharSequence)object5) ? 1 : 0)) == 0) {
                object5 = httpTransaction.getFormattedRequestBody();
            } else {
                n8 = R$string.chucker_body_empty;
                object5 = object.getString(n8);
            }
        } else {
            n8 = R$string.chucker_body_omitted;
            object5 = object.getString(n8);
        }
        ce_22.I0((String)object5);
        ce_22.I0("\n\n");
        object5 = new StringBuilder(string3);
        n7 = R$string.chucker_response;
        string3 = object.getString(n7);
        ((StringBuilder)object5).append(string3);
        ((StringBuilder)object5).append((String)object4);
        object5 = ((StringBuilder)object5).toString();
        ce_22.I0((String)object5);
        object5 = httpTransaction.getParsedResponseHeaders();
        if (object5 != null) {
            object2 = object5;
            object2 = (Iterable)object5;
            string2 = "";
            jv0_02 = new jv0_0(false);
            n3 = 30;
            if ((object5 = CollectionsKt.R((Iterable)object2, string2, null, null, jv0_02, n3)) != null) {
                object3 = object5;
            }
        }
        n8 = kotlin.text.b.k((CharSequence)object3) ^ 1;
        if (n8 != 0) {
            ce_22.I0((String)object3);
            ce_22.I0((String)charSequence);
        }
        if ((n4 = (int)(httpTransaction.isResponseBodyPlainText() ? 1 : 0)) != 0) {
            charSequence = httpTransaction.getResponseBody();
            if (charSequence != null && (n4 = (int)(kotlin.text.b.k(charSequence) ? 1 : 0)) == 0) {
                String string4 = httpTransaction.getFormattedResponseBody();
            } else {
                n4 = R$string.chucker_body_empty;
                String string5 = object.getString(n4);
            }
        } else {
            n4 = R$string.chucker_body_omitted;
            String string6 = object.getString(n4);
        }
        ce_22.I0((String)var1_5);
        return ce_22;
    }
}

