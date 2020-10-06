package sk.upjs.gursky.pdb;

import sk.upjs.gursky.bplustree.BPObject;

import java.nio.ByteBuffer;

public class SalaryAndOffsetEntry implements BPObject<PersonSalaryKey, SalaryAndOffsetEntry> {

    int salary; // int 4B
    long offset; // 8B

    public SalaryAndOffsetEntry() {
    }

    public SalaryAndOffsetEntry(int salary, long offset) {
        this.salary = salary;
        this.offset = offset;
    }

    @Override
    public int compareTo(SalaryAndOffsetEntry o) {
        return Integer.compare(this.salary, o.salary);
    }

    @Override
    public void load(ByteBuffer bb) {

        salary = bb.getInt();
        offset = bb.getLong();
    }

    @Override
    public void save(ByteBuffer bb) {
        bb.putInt(salary);
        bb.putLong(offset);
    }

    @Override
    public int getSize() {
        return 12;
    }

    @Override
    public PersonSalaryKey getKey() {
        return new PersonSalaryKey(salary);
    }

    public int getSalary() {
        return salary;
    }

    public long getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "SalaryAndOffsetEntry{" +
                "salary=" + salary +
                ", offset=" + offset +
                '}';
    }
}
