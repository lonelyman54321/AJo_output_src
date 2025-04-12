/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;

/*
 * Renamed from eu1
 */
public final class eu1_1
implements ComponentFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ LibraryVersionComponent$VersionExtractor b;

    public /* synthetic */ eu1_1(String string2, LibraryVersionComponent$VersionExtractor libraryVersionComponent$VersionExtractor) {
        this.a = string2;
        this.b = libraryVersionComponent$VersionExtractor;
    }

    public final Object create(ComponentContainer componentContainer) {
        String string2 = this.a;
        LibraryVersionComponent$VersionExtractor libraryVersionComponent$VersionExtractor = this.b;
        return LibraryVersionComponent.a(string2, libraryVersionComponent$VersionExtractor, componentContainer);
    }
}

