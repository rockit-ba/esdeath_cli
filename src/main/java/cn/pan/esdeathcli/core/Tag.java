package cn.pan.esdeathcli.core;

import java.util.Objects;



public final class Tag {
    public final String tag;

    public Tag(String tag) {
        check(tag);
        this.tag = tag;
    }

    public static void check(String tag) {
        if (tag == null || tag.isEmpty()) {
            throw new IllegalArgumentException("tag can not empty");
        }
    }

    @Override
    public String toString() {
        return tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag1 = (Tag) o;
        return Objects.equals(tag, tag1.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
}
