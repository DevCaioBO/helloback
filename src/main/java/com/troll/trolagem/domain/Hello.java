package com.troll.trolagem.domain;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.NotBlank;
	import lombok.AllArgsConstructor;
	import lombok.EqualsAndHashCode;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Entity
	@Table(name="tbhellos")

	@EqualsAndHashCode(of="idhellos")
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class Hello {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
			private Integer idhellos;
			
			private String nome;

			private String stats;
			
//			public Tasks (RequestTasks RequestTasks) {
//				this.nome = RequestTasks.nome();
//				this.stats = RequestTasks.stats();
//				}
			
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getStats() {
				return stats;
			}

			public void setStats(String stats) {
				this.stats = stats;
			}
			
			
			public Integer getId() {
				return idhellos ;
			};

			public void setId(Integer id_task) {
				this.idhellos = id_task;
			
			

		

	}
	}

