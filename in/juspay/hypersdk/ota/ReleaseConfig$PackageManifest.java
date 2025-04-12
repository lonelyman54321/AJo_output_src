/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Split;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ReleaseConfig$PackageManifest {
    private final ReleaseConfig$Split index;
    private final String name;
    private final JSONObject properties;
    private final List splits;
    private final String version;

    public ReleaseConfig$PackageManifest(String string2, String string3, JSONObject jSONObject, ReleaseConfig$Split releaseConfig$Split, List list) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "version");
        Intrinsics.checkNotNullParameter(jSONObject, "properties");
        Intrinsics.checkNotNullParameter(releaseConfig$Split, "index");
        Intrinsics.checkNotNullParameter(list, "splits");
        this.name = string2;
        this.version = string3;
        this.properties = jSONObject;
        this.index = releaseConfig$Split;
        this.splits = list;
    }

    public static /* synthetic */ ReleaseConfig$PackageManifest copy$default(ReleaseConfig$PackageManifest releaseConfig$PackageManifest, String string2, String object, JSONObject object2, ReleaseConfig$Split object3, List list, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = releaseConfig$PackageManifest.name;
        }
        if ((n4 = n3 & 2) != 0) {
            object = releaseConfig$PackageManifest.version;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = releaseConfig$PackageManifest.properties;
        }
        JSONObject jSONObject = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = releaseConfig$PackageManifest.index;
        }
        ReleaseConfig$Split releaseConfig$Split = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            list = releaseConfig$PackageManifest.splits;
        }
        List list2 = list;
        object = releaseConfig$PackageManifest;
        object2 = string2;
        object3 = object4;
        list = jSONObject;
        object4 = list2;
        return releaseConfig$PackageManifest.copy(string2, (String)object3, jSONObject, releaseConfig$Split, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.version;
    }

    public final JSONObject component3() {
        return this.properties;
    }

    public final ReleaseConfig$Split component4() {
        return this.index;
    }

    public final List component5() {
        return this.splits;
    }

    public final ReleaseConfig$PackageManifest copy(String string2, String string3, JSONObject jSONObject, ReleaseConfig$Split releaseConfig$Split, List list) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "version");
        Intrinsics.checkNotNullParameter(jSONObject, "properties");
        Intrinsics.checkNotNullParameter(releaseConfig$Split, "index");
        Intrinsics.checkNotNullParameter(list, "splits");
        ReleaseConfig$PackageManifest releaseConfig$PackageManifest = new ReleaseConfig$PackageManifest(string2, string3, jSONObject, releaseConfig$Split, list);
        return releaseConfig$PackageManifest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReleaseConfig$PackageManifest;
        if (!bl3) {
            return false;
        }
        object = (ReleaseConfig$PackageManifest)object;
        Object object2 = this.name;
        Object object3 = ((ReleaseConfig$PackageManifest)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.version;
        object3 = ((ReleaseConfig$PackageManifest)object).version;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.properties;
        object3 = ((ReleaseConfig$PackageManifest)object).properties;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.index;
        object3 = ((ReleaseConfig$PackageManifest)object).index;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.splits;
        object = ((ReleaseConfig$PackageManifest)object).splits;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getAllSplits() {
        List<Object> list = CollectionsKt.m0(this.splits);
        ReleaseConfig$Split releaseConfig$Split = this.index;
        list = Collections.unmodifiableList(CollectionsKt.X(list, releaseConfig$Split));
        Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(splits.toMutableList() + index)");
        return list;
    }

    public final List getFileNames() {
        Object object = this.getAllSplits();
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<String> arrayList = new ArrayList<String>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2 = ((ReleaseConfig$Split)object.next()).getFileName();
            arrayList.add(string2);
        }
        return arrayList;
    }

    public final ReleaseConfig$Split getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }

    public final List getSplits() {
        return this.splits;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        String string2 = this.version;
        n3 = zy_2.b(n3, 31, string2);
        int n4 = (this.properties.hashCode() + n3) * 31;
        n3 = (this.index.hashCode() + n4) * 31;
        return ((Object)this.splits).hashCode() + n3;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.name;
        jSONObject = jSONObject.put("name", (Object)jSONArray);
        jSONArray = this.version;
        jSONObject = jSONObject.put("version", (Object)jSONArray);
        jSONArray = this.properties;
        jSONObject = jSONObject.put("properties", (Object)jSONArray);
        jSONArray = this.index.getUrl().toString();
        jSONObject = jSONObject.put("index", (Object)jSONArray);
        jSONArray = this.splits;
        int n3 = yx_2.o((Iterable)jSONArray, 10);
        ArrayList<String> arrayList = new ArrayList<String>(n3);
        jSONArray = jSONArray.iterator();
        while ((n3 = (int)(jSONArray.hasNext() ? 1 : 0)) != 0) {
            String string2 = ((ReleaseConfig$Split)jSONArray.next()).getUrl().toString();
            arrayList.add(string2);
        }
        jSONArray = new JSONArray(arrayList);
        jSONObject = jSONObject.put("splits", (Object)jSONArray);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026p { it.url.toString() }))");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PackageManifest(name=");
        Object object = this.name;
        stringBuilder.append((String)object);
        stringBuilder.append(", version=");
        object = this.version;
        stringBuilder.append((String)object);
        stringBuilder.append(", properties=");
        object = this.properties;
        stringBuilder.append(object);
        stringBuilder.append(", index=");
        object = this.index;
        stringBuilder.append(object);
        stringBuilder.append(", splits=");
        object = this.splits;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

