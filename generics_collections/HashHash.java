class HashHash {
  public int x;
  HashHash(int xVal) { x = xVal; }

  public boolean equals(Object o) {
    HashHash h = (HashHash) o;

    if (h.x == this.x) {
      return true;
    } else {
      return false;
    }
  }
  public int hashCode() { return (x * 17); }
}
