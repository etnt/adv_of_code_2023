# Advent of Code 2023 in Kotlin
> Exploring working with Github Co-Pilot in an unknown programming language.

I was exploring the Github Co-Pilot and ended up writing Kotlin code.
I have never even seen any Kotlin code before so I thought this could be
an interesting test of Co-Pilot.

## Day 1

The task of Day 1 started out pretty good where the Co-Pilot quickly got
the first part correct. But with the second part I started to struggle.
I realised that I was just banging away prompts to Co-Pilot without really
thinking on what I wanted to achive. I ended up browsing through some Kotlin
documentation and wrote part 2 the good old (manual) way.

[Day1 code](app/src/main/kotlin/adv_of_code_2023/Day1.kt)
[Day1 test](app/src/test/kotlin/adv_of_code_2023/Day1Test.kt)

## Day 2

For the task of Day 2 I was not going to repeat the same mistake. Instead I
thought of what functions I needed in a bottom-up fashion and wrote
the prompts carefully. This time I got really good code in return from Co-Pilot.
I verified each generated funtion with small tests before I went on with the
next function. 

For the second part I realised that I just wanted to compute
the max values of each color for each game string, multiply them and som up
each line. Co-Pilot gave me to computation of the max values which I then just
had to fit into the existing code. I got a couple of errors, for example
because I thought I could unpack nested pairs in the same way as for a
single pair. Co-Pilot quickly explained my error and I could fix it.

Again I was blown away with how well this worked. If it continues
like this there is a risk I can't go back to the old (manual) way of 
writing code... :-P

[Day2 code](app/src/main/kotlin/adv_of_code_2023/Day2.kt)
[Day2 test](app/src/test/kotlin/adv_of_code_2023/Day2Test.kt)
