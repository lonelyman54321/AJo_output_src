/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldInfo$1;
import com.google.protobuf.FieldInfo$Builder;
import com.google.protobuf.FieldType;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.OneofInfo;
import java.lang.reflect.Field;

final class FieldInfo
implements Comparable {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal$EnumVerifier enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class messageClass;
    private final OneofInfo oneof;
    private final Class oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    private FieldInfo(Field field, int n3, FieldType fieldType, Class clazz, Field field2, int n4, boolean bl2, boolean bl3, OneofInfo oneofInfo, Class clazz2, Object object, Internal$EnumVerifier internal$EnumVerifier, Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = clazz;
        this.fieldNumber = n3;
        this.presenceField = field2;
        this.presenceMask = n4;
        this.required = bl2;
        this.enforceUtf8 = bl3;
        this.oneof = oneofInfo;
        this.oneofStoredType = clazz2;
        this.mapDefaultEntry = object;
        this.enumVerifier = internal$EnumVerifier;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int n3) {
        if (n3 > 0) {
            return;
        }
        String string2 = hj0_0.a(n3, "fieldNumber must be positive: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static FieldInfo forExplicitPresenceField(Field field, int n3, FieldType fieldType, Field field2, int n4, boolean bl2, Internal$EnumVerifier internal$EnumVerifier) {
        FieldInfo fieldInfo;
        boolean bl3;
        FieldInfo.checkFieldNumber(n3);
        Object object = field;
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Object object2 = "presenceField";
        Internal.checkNotNull(field2, (String)object2);
        if (field2 != null && !(bl3 = FieldInfo.isExactlyOneBitSet(n4))) {
            object = hj0_0.a(n4, "presenceMask must have exactly one bit set: ");
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object2 = fieldInfo;
        object = field;
        fieldInfo = new FieldInfo(field, n3, fieldType, null, field2, n4, false, bl2, null, null, null, internal$EnumVerifier, null);
        return fieldInfo;
    }

    public static FieldInfo forField(Field field, int n3, FieldType fieldType, boolean bl2) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Object object = FieldType.MESSAGE_LIST;
        if (fieldType != object && fieldType != (object = FieldType.GROUP_LIST)) {
            FieldInfo fieldInfo;
            object = fieldInfo;
            fieldInfo = new FieldInfo(field, n3, fieldType, null, null, 0, false, bl2, null, null, null, null, null);
            return fieldInfo;
        }
        object = new IllegalStateException("Shouldn't be called for repeated message fields.");
        throw object;
    }

    public static FieldInfo forFieldWithEnumVerifier(Field field, int n3, FieldType fieldType, Internal$EnumVerifier internal$EnumVerifier) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        FieldInfo fieldInfo = new FieldInfo(field, n3, fieldType, null, null, 0, false, false, null, null, null, internal$EnumVerifier, null);
        return fieldInfo;
    }

    public static FieldInfo forLegacyRequiredField(Field field, int n3, FieldType fieldType, Field field2, int n4, boolean bl2, Internal$EnumVerifier internal$EnumVerifier) {
        FieldInfo fieldInfo;
        boolean bl3;
        FieldInfo.checkFieldNumber(n3);
        Object object = field;
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Object object2 = "presenceField";
        Internal.checkNotNull(field2, (String)object2);
        if (field2 != null && !(bl3 = FieldInfo.isExactlyOneBitSet(n4))) {
            object = hj0_0.a(n4, "presenceMask must have exactly one bit set: ");
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object2 = fieldInfo;
        object = field;
        fieldInfo = new FieldInfo(field, n3, fieldType, null, field2, n4, true, bl2, null, null, null, internal$EnumVerifier, null);
        return fieldInfo;
    }

    public static FieldInfo forMapField(Field field, int n3, Object object, Internal$EnumVerifier internal$EnumVerifier) {
        Internal.checkNotNull(object, "mapDefaultEntry");
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        FieldType fieldType = FieldType.MAP;
        FieldInfo fieldInfo = new FieldInfo(field, n3, fieldType, null, null, 0, false, true, null, null, object, internal$EnumVerifier, null);
        return fieldInfo;
    }

    public static FieldInfo forOneofMemberField(int n3, FieldType fieldType, OneofInfo oneofInfo, Class clazz, boolean bl2, Internal$EnumVerifier internal$EnumVerifier) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Internal.checkNotNull(oneofInfo, "oneof");
        Object object = "oneofStoredType";
        Internal.checkNotNull(clazz, (String)object);
        boolean bl3 = fieldType.isScalar();
        if (bl3) {
            FieldInfo fieldInfo;
            object = fieldInfo;
            fieldInfo = new FieldInfo(null, n3, fieldType, null, null, 0, false, bl2, oneofInfo, clazz, null, internal$EnumVerifier, null);
            return fieldInfo;
        }
        CharSequence charSequence = new StringBuilder("Oneof is only supported for scalar fields. Field ");
        charSequence.append(n3);
        charSequence.append(" is of type ");
        charSequence.append((Object)fieldType);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public static FieldInfo forPackedField(Field field, int n3, FieldType fieldType, Field field2) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Object object = FieldType.MESSAGE_LIST;
        if (fieldType != object && fieldType != (object = FieldType.GROUP_LIST)) {
            FieldInfo fieldInfo;
            object = fieldInfo;
            fieldInfo = new FieldInfo(field, n3, fieldType, null, null, 0, false, false, null, null, null, null, field2);
            return fieldInfo;
        }
        object = new IllegalStateException("Shouldn't be called for repeated message fields.");
        throw object;
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(Field field, int n3, FieldType fieldType, Internal$EnumVerifier internal$EnumVerifier, Field field2) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        FieldInfo fieldInfo = new FieldInfo(field, n3, fieldType, null, null, 0, false, false, null, null, null, internal$EnumVerifier, field2);
        return fieldInfo;
    }

    public static FieldInfo forRepeatedMessageField(Field field, int n3, FieldType fieldType, Class clazz) {
        FieldInfo.checkFieldNumber(n3);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull((Object)fieldType, "fieldType");
        Internal.checkNotNull(clazz, "messageClass");
        FieldInfo fieldInfo = new FieldInfo(field, n3, fieldType, clazz, null, 0, false, false, null, null, null, null, null);
        return fieldInfo;
    }

    private static boolean isExactlyOneBitSet(int n3) {
        int n4;
        n3 = n3 != 0 && (n3 &= (n4 = n3 + -1)) == 0 ? 1 : 0;
        return n3 != 0;
    }

    public static FieldInfo$Builder newBuilder() {
        FieldInfo$Builder fieldInfo$Builder = new FieldInfo$Builder(null);
        return fieldInfo$Builder;
    }

    public int compareTo(FieldInfo fieldInfo) {
        int n3 = this.fieldNumber;
        int n4 = fieldInfo.fieldNumber;
        return n3 - n4;
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal$EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class getMessageFieldClass() {
        Object object = FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType;
        FieldType fieldType = this.type;
        int n3 = fieldType.ordinal();
        int n4 = object[n3];
        if (n4 != (n3 = 1) && n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 != n3 && n4 != (n3 = 4)) {
                return null;
            }
            return this.messageClass;
        }
        object = this.field;
        object = object != null ? ((Field)object).getType() : this.oneofStoredType;
        return object;
    }

    public OneofInfo getOneof() {
        return this.oneof;
    }

    public Class getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }
}

