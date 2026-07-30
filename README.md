# 🗺️ Global Currency & Capital Information Desk

A Java console application providing instantaneous $O(1)$ country information retrieval using Hash-based mapping structures.

---

## 🚀 Key Features & Concepts Implemented

* **$O(1)$ Fast Search Retrieval (`HashMap`):** Utilized Java `HashMap` to achieve constant-time lookup performance when searching country profiles by name[cite: 14].
* **Case-Insensitive Querying:** Key normalization using `.toLowerCase().trim()` to handle user inputs seamlessly[cite: 14].
* **Map Iteration (`Map.Entry`):** Employed entry-set traversal loops to iterate through stored record sets smoothly[cite: 14].

---

## 🏗️ Architecture Overview

```text
📦 Global_Currency_Capital_Information_Desk
 ├── 📄 Country.java              --> Data model for holding nation profiles[cite: 13]
 ├── 📄 CurrencyDeskManager.java  --> Logic engine managing HashMaps & Search Operations[cite: 14]
 └── 📄 UserCountry.java          --> CLI menu driver[cite: 15]
