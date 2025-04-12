/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.Consumer;
import org.jsoup.parser.Tag;

/*
 * Renamed from ti3
 */
public final class ti3_1
implements Consumer {
    public final /* synthetic */ Map.Entry a;

    public /* synthetic */ ti3_1(Map.Entry entry) {
        this.a = entry;
    }

    public final void accept(Object object) {
        Map.Entry entry = this.a;
        object = (Tag)object;
        Tag.f(entry, (Tag)object);
    }
}

