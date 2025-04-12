/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec$1;
import com.google.common.cache.CacheBuilderSpec$AccessDurationParser;
import com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser;
import com.google.common.cache.CacheBuilderSpec$InitialCapacityParser;
import com.google.common.cache.CacheBuilderSpec$KeyStrengthParser;
import com.google.common.cache.CacheBuilderSpec$MaximumSizeParser;
import com.google.common.cache.CacheBuilderSpec$MaximumWeightParser;
import com.google.common.cache.CacheBuilderSpec$RecordStatsParser;
import com.google.common.cache.CacheBuilderSpec$RefreshDurationParser;
import com.google.common.cache.CacheBuilderSpec$ValueParser;
import com.google.common.cache.CacheBuilderSpec$ValueStrengthParser;
import com.google.common.cache.CacheBuilderSpec$WriteDurationParser;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class CacheBuilderSpec {
    private static final Splitter KEYS_SPLITTER = Splitter.on(',').trimResults();
    private static final Splitter KEY_VALUE_SPLITTER = Splitter.on('=').trimResults();
    private static final ImmutableMap VALUE_PARSERS;
    long accessExpirationDuration;
    TimeUnit accessExpirationTimeUnit;
    Integer concurrencyLevel;
    Integer initialCapacity;
    LocalCache$Strength keyStrength;
    Long maximumSize;
    Long maximumWeight;
    Boolean recordStats;
    long refreshDuration;
    TimeUnit refreshTimeUnit;
    private final String specification;
    LocalCache$Strength valueStrength;
    long writeExpirationDuration;
    TimeUnit writeExpirationTimeUnit;

    static {
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        CacheBuilderSpec$ValueParser cacheBuilderSpec$ValueParser = new CacheBuilderSpec$InitialCapacityParser();
        immutableMap$Builder = immutableMap$Builder.put("initialCapacity", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$MaximumSizeParser();
        immutableMap$Builder = immutableMap$Builder.put("maximumSize", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$MaximumWeightParser();
        immutableMap$Builder = immutableMap$Builder.put("maximumWeight", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$ConcurrencyLevelParser();
        immutableMap$Builder = immutableMap$Builder.put("concurrencyLevel", cacheBuilderSpec$ValueParser);
        LocalCache$Strength localCache$Strength = LocalCache$Strength.WEAK;
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$KeyStrengthParser(localCache$Strength);
        immutableMap$Builder = immutableMap$Builder.put("weakKeys", cacheBuilderSpec$ValueParser);
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.SOFT;
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$ValueStrengthParser(localCache$Strength2);
        immutableMap$Builder = immutableMap$Builder.put("softValues", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$ValueStrengthParser(localCache$Strength);
        immutableMap$Builder = immutableMap$Builder.put("weakValues", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$RecordStatsParser();
        immutableMap$Builder = immutableMap$Builder.put("recordStats", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$AccessDurationParser();
        immutableMap$Builder = immutableMap$Builder.put("expireAfterAccess", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$WriteDurationParser();
        immutableMap$Builder = immutableMap$Builder.put("expireAfterWrite", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$RefreshDurationParser();
        immutableMap$Builder = immutableMap$Builder.put("refreshAfterWrite", cacheBuilderSpec$ValueParser);
        cacheBuilderSpec$ValueParser = new CacheBuilderSpec$RefreshDurationParser();
        VALUE_PARSERS = immutableMap$Builder.put("refreshInterval", cacheBuilderSpec$ValueParser).buildOrThrow();
    }

    private CacheBuilderSpec(String string2) {
        this.specification = string2;
    }

    public static /* synthetic */ String access$000(String string2, Object[] objectArray) {
        return CacheBuilderSpec.format(string2, objectArray);
    }

    public static CacheBuilderSpec disableCaching() {
        return CacheBuilderSpec.parse("maximumSize=0");
    }

    private static Long durationInNanos(long l2, TimeUnit timeUnit) {
        Long l3;
        if (timeUnit == null) {
            l3 = null;
        } else {
            l2 = timeUnit.toNanos(l2);
            l3 = l2;
        }
        return l3;
    }

    private static String format(String string2, Object ... objectArray) {
        return String.format(Locale.ROOT, string2, objectArray);
    }

    public static CacheBuilderSpec parse(String object) {
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec((String)object);
        boolean bl2 = ((String)object).isEmpty();
        if (!bl2) {
            Object object2 = KEYS_SPLITTER;
            object = ((Splitter)object2).split((CharSequence)object).iterator();
            while (bl2 = object.hasNext()) {
                CacheBuilderSpec$ValueParser cacheBuilderSpec$ValueParser;
                object2 = (String)object.next();
                Object object3 = ImmutableList.copyOf(KEY_VALUE_SPLITTER.split((CharSequence)object2));
                int n3 = object3.isEmpty();
                int n4 = 1;
                String string2 = "blank key-value pair";
                Preconditions.checkArgument((n3 ^= n4) != 0, string2);
                n3 = object3.size();
                int n7 = 2;
                boolean bl3 = false;
                if (n3 <= n7) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    cacheBuilderSpec$ValueParser = null;
                }
                string2 = "key-value pair %s with more than one equals sign";
                Preconditions.checkArgument(n3 != 0, string2, object2);
                object2 = (String)object3.get(0);
                cacheBuilderSpec$ValueParser = (CacheBuilderSpec$ValueParser)VALUE_PARSERS.get(object2);
                if (cacheBuilderSpec$ValueParser != null) {
                    bl3 = true;
                }
                string2 = "unknown key %s";
                Preconditions.checkArgument(bl3, string2, object2);
                n7 = object3.size();
                object3 = n7 == n4 ? null : (String)object3.get(n4);
                cacheBuilderSpec$ValueParser.parse(cacheBuilderSpec, (String)object2, (String)object3);
            }
        }
        return cacheBuilderSpec;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block6: {
            block5: {
                TimeUnit timeUnit;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl3 = object instanceof CacheBuilderSpec;
                if (!bl3) {
                    return false;
                }
                object = (CacheBuilderSpec)object;
                Object object2 = this.initialCapacity;
                Object object3 = ((CacheBuilderSpec)object).initialCapacity;
                bl3 = Objects.equal(object2, object3);
                if (!bl3 || !(bl3 = Objects.equal(object2 = this.maximumSize, object3 = ((CacheBuilderSpec)object).maximumSize)) || !(bl3 = Objects.equal(object2 = this.maximumWeight, object3 = ((CacheBuilderSpec)object).maximumWeight)) || !(bl3 = Objects.equal(object2 = this.concurrencyLevel, object3 = ((CacheBuilderSpec)object).concurrencyLevel)) || !(bl3 = Objects.equal(object2 = this.keyStrength, object3 = ((CacheBuilderSpec)object).keyStrength)) || !(bl3 = Objects.equal(object2 = this.valueStrength, object3 = ((CacheBuilderSpec)object).valueStrength)) || !(bl3 = Objects.equal(object2 = this.recordStats, object3 = ((CacheBuilderSpec)object).recordStats))) break block5;
                long l2 = this.writeExpirationDuration;
                object2 = this.writeExpirationTimeUnit;
                bl3 = Objects.equal(object2 = CacheBuilderSpec.durationInNanos(l2, (TimeUnit)((Object)object2)), object3 = CacheBuilderSpec.durationInNanos(l2 = ((CacheBuilderSpec)object).writeExpirationDuration, timeUnit = ((CacheBuilderSpec)object).writeExpirationTimeUnit));
                if (!bl3) break block5;
                l2 = this.accessExpirationDuration;
                object2 = this.accessExpirationTimeUnit;
                bl3 = Objects.equal(object2 = CacheBuilderSpec.durationInNanos(l2, (TimeUnit)((Object)object2)), object3 = CacheBuilderSpec.durationInNanos(l2 = ((CacheBuilderSpec)object).accessExpirationDuration, timeUnit = ((CacheBuilderSpec)object).accessExpirationTimeUnit));
                if (!bl3) break block5;
                l2 = this.refreshDuration;
                object2 = this.refreshTimeUnit;
                object2 = CacheBuilderSpec.durationInNanos(l2, (TimeUnit)((Object)object2));
                l2 = ((CacheBuilderSpec)object).refreshDuration;
                object = ((CacheBuilderSpec)object).refreshTimeUnit;
                boolean bl4 = Objects.equal(object2, object = CacheBuilderSpec.durationInNanos(l2, (TimeUnit)((Object)object)));
                if (bl4) break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        Integer n3 = this.initialCapacity;
        Long l2 = this.maximumSize;
        Long l3 = this.maximumWeight;
        Integer n4 = this.concurrencyLevel;
        LocalCache$Strength localCache$Strength = this.keyStrength;
        LocalCache$Strength localCache$Strength2 = this.valueStrength;
        Boolean bl2 = this.recordStats;
        long l4 = this.writeExpirationDuration;
        Object object = this.writeExpirationTimeUnit;
        Long l7 = CacheBuilderSpec.durationInNanos(l4, object);
        long l8 = this.accessExpirationDuration;
        Object[] objectArray = this.accessExpirationTimeUnit;
        Long l12 = CacheBuilderSpec.durationInNanos(l8, (TimeUnit)objectArray);
        long l14 = this.refreshDuration;
        TimeUnit timeUnit = this.refreshTimeUnit;
        object = CacheBuilderSpec.durationInNanos(l14, timeUnit);
        objectArray = new Object[]{n3, l2, l3, n4, localCache$Strength, localCache$Strength2, bl2, l7, l12, object};
        return Objects.hashCode(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public CacheBuilder toCacheBuilder() {
        TimeUnit timeUnit;
        TimeUnit timeUnit2;
        long l2;
        TimeUnit timeUnit3;
        Boolean bl2;
        LocalCache$Strength localCache$Strength;
        int[] nArray;
        Integer n3;
        Long l3;
        long l4;
        Long l7;
        int n4;
        Object object = CacheBuilder.newBuilder();
        Integer n7 = this.initialCapacity;
        if (n7 != null) {
            n4 = n7;
            ((CacheBuilder)object).initialCapacity(n4);
        }
        if ((l7 = this.maximumSize) != null) {
            l4 = l7;
            ((CacheBuilder)object).maximumSize(l4);
        }
        if ((l3 = this.maximumWeight) != null) {
            l4 = l3;
            ((CacheBuilder)object).maximumWeight(l4);
        }
        if ((n3 = this.concurrencyLevel) != null) {
            n4 = n3;
            ((CacheBuilder)object).concurrencyLevel(n4);
        }
        LocalCache$Strength localCache$Strength2 = this.keyStrength;
        int n8 = 1;
        if (localCache$Strength2 != null) {
            nArray = CacheBuilderSpec$1.$SwitchMap$com$google$common$cache$LocalCache$Strength;
            n4 = localCache$Strength2.ordinal();
            if ((n4 = nArray[n4]) != n8) {
                object = new AssertionError();
                throw object;
            }
            ((CacheBuilder)object).weakKeys();
        }
        if ((localCache$Strength = this.valueStrength) != null) {
            nArray = CacheBuilderSpec$1.$SwitchMap$com$google$common$cache$LocalCache$Strength;
            n4 = localCache$Strength.ordinal();
            if ((n4 = nArray[n4]) != n8) {
                n8 = 2;
                if (n4 != n8) {
                    object = new AssertionError();
                    throw object;
                }
                ((CacheBuilder)object).softValues();
            } else {
                ((CacheBuilder)object).weakValues();
            }
        }
        if ((bl2 = this.recordStats) != null && (n4 = (int)(bl2.booleanValue() ? 1 : 0)) != 0) {
            ((CacheBuilder)object).recordStats();
        }
        if ((timeUnit3 = this.writeExpirationTimeUnit) != null) {
            l2 = this.writeExpirationDuration;
            ((CacheBuilder)object).expireAfterWrite(l2, timeUnit3);
        }
        if ((timeUnit2 = this.accessExpirationTimeUnit) != null) {
            l2 = this.accessExpirationDuration;
            ((CacheBuilder)object).expireAfterAccess(l2, timeUnit2);
        }
        if ((timeUnit = this.refreshTimeUnit) != null) {
            l2 = this.refreshDuration;
            ((CacheBuilder)object).refreshAfterWrite(l2, timeUnit);
        }
        return object;
    }

    public String toParsableString() {
        return this.specification;
    }

    public String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        String string2 = this.toParsableString();
        return moreObjects$ToStringHelper.addValue(string2).toString();
    }
}

