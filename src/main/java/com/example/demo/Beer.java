package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beer {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String name;
		private Double abv;
		
		public Beer() {
			this.id = (long) 0;
			this.name = "N/A";
			this.abv = 0.0;
		}
		
		
		public Beer(Long id, String name, Double abv) {
			super();
			this.id = id;
			this.name = name;
			this.abv = abv;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getAbv() {
			return abv;
		}
		public void setAbv(Double abv) {
			this.abv = abv;
		}
		
		
}
