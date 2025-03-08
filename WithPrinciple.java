class WithPrinciple {
  int[] weights = new int[2];
  int index = 0;

  void addWeight(int weight) {
      weights[index] = weight;
      index++;
  }

  int getWeight(int i) {
      return weights[i];
  }

  int getTotalWeight() {
      int total = 0;
      for (int i = 0; i < index; i++) {
          total += getWeight(i);
      }
      return total;
  }

  public static void main(String[] args) {
      WithPrinciple obj = new WithPrinciple();
      obj.addWeight(10);
      obj.addWeight(20);

      System.out.println("Total Weight: " + obj.getTotalWeight());
  }
}