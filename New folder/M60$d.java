/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.view.ContentInfo
 */
import android.content.ClipData;
import android.view.ContentInfo;

public final class M60$d
implements M60$e {
    public final ContentInfo a;

    public M60$d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo = P60.a(contentInfo);
    }

    public final ClipData a() {
        return N60.a(this.a);
    }

    public final ContentInfo b() {
        return this.a;
    }

    public final int getFlags() {
        return O60.a(this.a);
    }

    public final int getSource() {
        return Q60.a(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{");
        ContentInfo contentInfo = this.a;
        stringBuilder.append(contentInfo);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

