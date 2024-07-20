
#include <iostream>
using namespace std;

int main() {
    int a, b, c, d, s;
    cin >> a >> b >> c >> d >> s;

    int nikky_position = 0;
    int byron_position = 0;

    int nikky_steps = 0;
    int byron_steps = 0;

    while (nikky_steps < s || byron_steps < s) {
        // Nikky's movement
        if (nikky_steps < s) {
            for (int i = 0; i < a && nikky_steps < s; ++i) {
                nikky_position++;
                nikky_steps++;
            }
            for (int i = 0; i < b && nikky_steps < s; ++i) {
                nikky_position--;
                nikky_steps++;
            }
        }

        // Byron's movement
        if (byron_steps < s) {
            for (int i = 0; i < c && byron_steps < s; ++i) {
                byron_position++;
                byron_steps++;
            }
            for (int i = 0; i < d && byron_steps < s; ++i) {
                byron_position--;
                byron_steps++;
            }
        }
    }

    // Compare positions
    if (nikky_position > byron_position) {
        cout << "Nikky" << endl;
    } else if (byron_position > nikky_position) {
        cout << "Byron" << endl;
    } else {
        cout << "Tied" << endl;
    }

    return 0;
}

