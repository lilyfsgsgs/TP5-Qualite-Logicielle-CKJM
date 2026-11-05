# TP5 — Qualité Logicielle : Analyse des métriques avec CKJM

**Réalisé par : Salma Darnague**

## Description

Ce projet a été réalisé dans le cadre du TP5 de Qualité Logicielle.

Il consiste à analyser les métriques orientées objet d'une application Java de gestion de bibliothèque à l'aide de CKJM, puis à effectuer un refactoring afin d'améliorer la qualité du code.

## Technologies utilisées

- Java 8
- CKJM 1.8
- Programmation orientée objet

## Structure du projet

- `library.model` : Book, DigitalBook, Lendable
- `library.service` : Library, Customer
- `library.app` : LibraryApp, NumberClassifier

## Refactoring réalisé

La méthode de traitement numérique a été retirée de la classe `Book` et déplacée dans une nouvelle classe `NumberClassifier`, afin de mieux séparer les responsabilités.

Les métriques CKJM ont ensuite été comparées avant et après cette modification.

## Résultats

Pour la classe `Book` :

| Métrique | Avant | Après |
|---|---|---|
| WMC | 7 | 6 |
| RFC | 13 | 8 |
| LCOM | 5 | 0 |

## Auteur

**Salma Darnague**

TP5 — Qualité Logicielle
