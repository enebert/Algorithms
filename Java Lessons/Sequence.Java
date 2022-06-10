import java.util.*;

class Sequence implements Comparable<Sequence>{

		private ArrayList<Comparable> values;

		Sequence(){
			List<Integer> primes = List.of(2,3,5);
			values = new ArrayList(primes);
		}

		Sequence(ArrayList<Comparable> v){
			values = v;
		}

		public String toString(){
			return Arrays.toString(values);
		}

		public int compareTo(Sequence other){
			// A sequence with fewer terms is less than the sequence with longer terms.
				if(this.values.size() != other.values.size()){
					if(this.values.size() > other.values.size()) return 1;
					if(this.values.size() < other.values.size()) return -1;
				}



			// If the sequences have the same length and contain the same elements, then return 0
			// // Sequences that are the same length and not equal are compared term by term
				if(this.values.size() == other.values.size()){
					for(int i=0; i < this.values.size(); i++){
						if(this.values.get(i).equals(other.get(i))) return this.values.get(i).compareTo(other.values[i]);
					}
				}
			return 0;
		}

		public Comparable[] getValues(){
			return values;
		}
	}
